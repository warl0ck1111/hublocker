package com.example.hublocker.repository;

import com.example.hublocker.models.Locker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Okala III
 */

@Repository
public interface LockerRepository extends JpaRepository<Locker,Long> {

}
