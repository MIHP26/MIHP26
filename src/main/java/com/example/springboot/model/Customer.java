package com.example.springboot.model;

import java.security.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @Column(name="customer_id")
    private long customerId;

    @Column(name="shop_name")
    private String shopName;

    @Column(name="owner_name")
    private String ownerName;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="email")
    private String email;

    @Column(name="description")
    private String description;

    @Column(name="status")
    private String status;

    @Column(name="creation_time")
    private Timestamp creationTime;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = { CascadeType.ALL })
    private List<Address> customerAddress;
}
