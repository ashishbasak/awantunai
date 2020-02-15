package com.awantunai.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

//each transaction
@Entity
@Getter
@Setter
public class TransactionDetails {
    @Id
    @Column(name = "txn_id")
    private String txnId;


    @Column(name = "user_id")
    private String userId;

    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "amount")
    private String amount;

    @Column(name = "mode_payment")
    private String paymentMode;


    @Column(name = "txn_ref_no")
    private String refNo;


    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;


}
