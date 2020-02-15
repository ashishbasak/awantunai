package com.awantunai.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//roles assinged to users
@Entity
@Getter
@Setter
public class UserRoles {

    @Id
    @Column(name = "role_id")
    private String roleId;

    @Column(name = "user_id")
    private String userId;
}
