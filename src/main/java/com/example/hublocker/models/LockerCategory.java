package com.example.hublocker.models;

/**
 *
 * @author Okala III
 */
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "locker_category")
public class LockerCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

}
