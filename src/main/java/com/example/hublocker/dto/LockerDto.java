package com.example.hublocker.dto;

import lombok.Data;

/**
 * @author Okala III
 */

@Data
public class LockerDto {

    private Long id;

    private String name;

    private String dimensions;

    private String description;

    private double price = 0.00;

    private double priceDescription;

    private String promoOffer;

    private double quantity = 0;


    private long category;

    private long location;


}
