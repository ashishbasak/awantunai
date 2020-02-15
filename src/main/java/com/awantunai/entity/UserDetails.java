package com.awantunai.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * The type User.
 */
@Entity
@Getter
@Setter
@Table(name = "users_mast")
public class UserDetails {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "FAIL_COUNT")
    private String failCount;

    @Column(name = "PASSWORD_RESET_DATE")
    private LocalDateTime passwdResetDt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "user_group")
    private String userGroup;

    @Column(name = "status")
    private String status;

    @Column(name = "MOBILENO")
    private String mobNo;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "date_of_birth")
    private Date dob;

    @Column(name = "address")
    private String address;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

}
