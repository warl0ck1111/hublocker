package com.example.hublocker;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

@Slf4j
@SpringBootApplication
public class HublockerApplication implements ApplicationListener<ContextRefreshedEvent> {


	@Autowired
	private DataSource dataSource;


//	change this variable in the application.properties file after the first successful run
	@Value("${databaseAlreadySetup}")
	boolean alreadySetup;

	public static void main(String[] args) {
		SpringApplication.run(HublockerApplication.class, args);

		log.info("\n\n>>>>>>>>>>>>>>>>> HUB LOCKER APPLICATION SERVER STARTED <<<<<<<<<<<<<<<<<<<<\n\n");

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		if(alreadySetup) return;
		scriptRunner("hub-locker.sql");
	}

	/**
	 * @param sqlFile
	 */
	public void scriptRunner(String sqlFile) {


		try {

			// Initialize object for ScripRunner
			ScriptRunner sr = new ScriptRunner(dataSource.getConnection());
			// Give the input file to Reader
			Reader reader = new BufferedReader(new FileReader(sqlFile));
			// Execute script
			sr.runScript(reader);
		} catch (Exception e) {
			log.info("Failed to Execute{0} The error is {1}", new Object[]{sqlFile, e.getMessage()});
		}
	}
}
