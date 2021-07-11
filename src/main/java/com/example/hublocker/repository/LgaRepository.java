package com.example.hublocker.repository;

import com.example.hublocker.models.Lga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Okala III
 */

@Repository
public interface LgaRepository extends JpaRepository<Lga,Long> {

}
