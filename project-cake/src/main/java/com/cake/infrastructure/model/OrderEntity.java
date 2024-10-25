package com.cake.infrastructure.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    private String name;
    private String address;
    private String size;
    private String flavor;
    private String state;

    public OrderEntity() {}

    public OrderEntity(String phoneNumber, String name, String address, String size, String flavor, String state) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.size = size;
        this.flavor = flavor;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getState() {
        return state;
    }

}
