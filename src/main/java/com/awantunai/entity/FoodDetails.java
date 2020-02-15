package com.awantunai.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//individual food items
@Entity
@Getter
@Setter
public class FoodDetails {

    @Id
    @Column(name = "food_id")
    private String foodId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private String price;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "serves")
    private String serves;
}
