package com.awantunai.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

// roles with permissions
@Entity
@Getter
@Setter
public class Roles {

    @Id
    @Column(name = "role_id")
    private LocalDateTime roleId;

    @Column(name = "role_name")
    private LocalDateTime name;
}
