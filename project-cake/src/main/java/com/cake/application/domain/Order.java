package com.cake.application.domain;

public class Order {

    private final String phoneNumber;
    private final String name;
    private final String address;
    private final String size;
    private final String flavor;
    private String state = "CREATED";

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

    public String getState() {
        return state;
    }

    public String toString() {
        return "Order: " + phoneNumber + ", " + name + ", " + address + ", " + size + ", " + flavor + ". State: " + state;
    }

}
