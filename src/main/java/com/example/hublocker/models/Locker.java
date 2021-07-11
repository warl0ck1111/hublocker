package com.example.hublocker.models;

/**
 *
 * @author Okala III
 */
import com.example.hublocker.enumerations.LockerStatus;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Locker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DIMENSIONS")
    private String dimensions;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private LockerStatus lockerStatus = LockerStatus.AVAILABLE;

    @Column(name = "PRICE")
    private double price = 0.00;

    @Column(name = "PRICE_DESCRIPTION")
    private String priceDescription;

    @Column(name = "PROMO_OFFER")
    private String promoOffer;

    @Column(name = "QUANTITY")
    private double quantity = 0;

    @OneToOne
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID")
    private LockerCategory category;

    @ManyToOne
    @JoinColumn(name = "LGA_ID", referencedColumnName = "ID")
    private Lga location;


}
