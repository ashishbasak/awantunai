package com.awantunai.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//details of food per merchant
@Entity
@Getter
@Setter
public class MerchantFood {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "food_id")
    private String foodId;
}
