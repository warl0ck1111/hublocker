package com.example.hublocker.service;

import com.example.hublocker.dto.LockerDto;
import com.example.hublocker.models.Lga;
import com.example.hublocker.models.Locker;
import com.example.hublocker.models.LockerCategory;
import com.example.hublocker.repository.LgaRepository;
import com.example.hublocker.repository.LockerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Okala III
 */

@Service
public class LockerService implements CRUDService<Locker,LockerDto>{


    @Autowired
    private LockerRepository lockerRepository;

    @Autowired
    private LgaRepository lgaRepository;

    private Locker locker;

    @Override
    public Locker create(LockerDto dto) {
        //TODO: sanitize dto input
        locker = new Locker();
        BeanUtils.copyProperties(dto,locker);

        return lockerRepository.save(locker);
    }

    @Override
    public List<Locker> create(List<LockerDto> d) {
        return null;
    }

    @Override
    public Locker update(LockerDto dto) {

        //TODO: sanitize dto input
        locker = lockerRepository.findById(dto.getId()).orElseThrow(()-> new NoSuchElementException("Invalid Locker Id"));
        BeanUtils.copyProperties(dto,locker);

        return lockerRepository.save(locker);
    }

    @Override
    public List<Locker> update(List<LockerDto> d) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        locker = lockerRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Invalid Locker Id"));

        lockerRepository.delete(locker);
        return true;
    }

    @Override
    public List<Locker> findAll() {
        return lockerRepository.findAll();
    }

    @Override
    public Locker findById(long id) {
        return lockerRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Invalid Locker Id"));
    }
}
