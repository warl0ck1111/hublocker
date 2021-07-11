package com.example.hublocker.repository;

import com.example.hublocker.models.LockerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Okala III
 */

@Repository
public interface LockerCategoryRepository extends JpaRepository<LockerCategory, Long> {
}
