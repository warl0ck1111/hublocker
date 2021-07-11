package com.example.hublocker.repository;

import com.example.hublocker.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Okala III
 */
@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
