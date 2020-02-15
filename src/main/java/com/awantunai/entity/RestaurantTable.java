package com.awantunai.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//restaurant table details
@Entity
@Getter
@Setter
public class RestaurantTable {

    @Id
    @Column(name = "table_id")
    private String id;

    @Column(name = "table_size")
    private String size;

    @Column(name = "merchant_id")
    private String merchantId;


}
