package domain.person;

import domain.address.Country;

public class Address {

    private Country country;
    private String city;
    private String street;
    private String number;

    public Address(Country country, String city, String street, String number) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
    }
}
