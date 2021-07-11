
package com.example.hublocker.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author @Okala III
 */
@Data
@Entity
@Table(name = "LGA")
public class Lga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "STATE_ID", referencedColumnName = "id")
    private State state;

}
