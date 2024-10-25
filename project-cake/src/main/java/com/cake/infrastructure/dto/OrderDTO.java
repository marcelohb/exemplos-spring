package com.cake.infrastructure.dto;

public class OrderDTO {

    private Long id;
    private String phoneNumber;
    private String name;
    private String address;
    private String size;
    private String flavor;
    private String state;

    public OrderDTO(Long id, String phoneNumber, String name, String address, String size, String flavor, String state) {
        this.id = id;
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
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String toString() {
        return "Order: " + phoneNumber + ", " + name + ", " + address + ", " + size + ", " + flavor + ". State: " + state;
    }
}
