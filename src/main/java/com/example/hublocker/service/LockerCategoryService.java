package com.example.hublocker.service;

import com.example.hublocker.dto.LockerCategoryDto;
import com.example.hublocker.models.LockerCategory;
import com.example.hublocker.repository.LockerCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Okala III
 */

@Service
public class LockerCategoryService implements CRUDService<LockerCategory, LockerCategoryDto> {

    @Autowired
    private LockerCategoryRepository lockerCategoryRepository;

    @Override
    public LockerCategory create(LockerCategoryDto e) {
        return null;
    }

    @Override
    public List<LockerCategory> create(List<LockerCategoryDto> d) {
        return null;
    }

    @Override
    public LockerCategory update(LockerCategoryDto d) {
        return null;
    }

    @Override
    public List<LockerCategory> update(List<LockerCategoryDto> d) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public List<LockerCategory> findAll() {
        return null;
    }

    @Override
    public LockerCategory findById(long id) {
        return null;
    }
}
