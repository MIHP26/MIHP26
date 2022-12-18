package com.example.springboot.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
public class Address {
    @Id
    @Column(name="address_id")
    private long addressId;

    @Column(name="address_name")
    private String addressName;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="postal_code")
    private String postalCode;

    @Column(name="country")
    private String country;

    @Column(name="status")
    private String status;

    @Column(name="creation_time")
    private Timestamp creationTime;
}
