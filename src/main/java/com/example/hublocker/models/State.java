package com.example.hublocker.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author  @Okala III
 */

@Data
@Entity
@Table(name = "STATE")
public class State implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;


}
