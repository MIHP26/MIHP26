package com.example.springboot.model;

import java.security.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="user_id")
    private long userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="status")
    private String status;

    @Column(name="creation_time")
    private Timestamp creationTime;

    @OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;
}
