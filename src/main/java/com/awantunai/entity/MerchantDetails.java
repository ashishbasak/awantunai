package com.awantunai.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

//retaurant details
@Entity
@Getter
@Setter
public class MerchantDetails {

    @Id
    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "merchant_group")
    private String merchantGroup;

    @Column(name = "status")
    private String status;

    @Column(name = "MOBILENO")
    private String mobNo;

    @Column(name = "address")
    private String address;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;
}
