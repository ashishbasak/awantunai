package com.awantunai.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//orders of user
@Entity
@Getter
@Setter
public class UserOrder {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "order_id")
    private String orderId;

}
