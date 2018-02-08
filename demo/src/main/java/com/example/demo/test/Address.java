package com.example.demo.test;

public class Address {

    private String country;
    private String province;
    private String city;
    private String street;
    private String address;

    public Address(String country, String province, String city, String street, String address) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.address = address;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
