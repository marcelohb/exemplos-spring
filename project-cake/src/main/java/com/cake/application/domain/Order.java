package com.cake.application.domain;

public class Order {

    private String phoneNumber;
    private String name;
    private String address;
    private String size;
    private String flavor;

    public Order(String phoneNumber, String name, String address, String size, String flavor) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.size = size;
        this.flavor = flavor;
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

}
