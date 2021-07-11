package com.example.hublocker.controller;

import com.example.hublocker.dto.LockerDto;
import com.example.hublocker.service.LockerCategoryService;
import com.example.hublocker.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Okala III
 */

@RestController
@RequestMapping("api/locker")
@CrossOrigin(origins = {"http://localhost:4201/","*"})
public class LockerController {

    @Autowired
    private LockerService lockerService;

    @Autowired
    private LockerCategoryService lockerCategoryService;

    @PostMapping("/create")
    public ResponseEntity<?> createLocker(@RequestBody LockerDto dto){
        return new ResponseEntity<>(lockerService.create(dto), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateLocker(@RequestBody LockerDto dto, @PathVariable("id") long id){
        return new ResponseEntity<>(lockerService.create(dto), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> updateLocker(@RequestBody LockerDto dto){
        return new ResponseEntity<>(lockerService.create(dto), HttpStatus.OK);
    }

    @GetMapping("get-all")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(lockerService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/category/get-all")
    public ResponseEntity<?> getAllCategory(){
        return new ResponseEntity<>(lockerCategoryService.findAll(), HttpStatus.OK);
    }
}
