package com.awantunai.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

//tables of users
@Entity
@Getter
@Setter
public class UserTable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "table_id")
    private String tableId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "table_for")
    private String tableFor;

    @Column(name = "duration")
    private String duration;


    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;



}
