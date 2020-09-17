package com.dchristofolli.zeromqmessaging.messaging;

import java.io.Serializable;

public class Address implements Serializable {
    private static final long serialVersionUID = 7429303021638571397L;
    private String country;
    private String state;
    private String city;
    private String district;
    private String street;
    private String number;
    private String complement;
    private String zipCode;

    public Address() {
    }

    public Address(String country, String state, String city, String district, String street,
                   String number, String complement, String zipCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.district = district;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
            "country='" + country + '\'' +
            ", state='" + state + '\'' +
            ", city='" + city + '\'' +
            ", district='" + district + '\'' +
            ", street='" + street + '\'' +
            ", number='" + number + '\'' +
            ", complement='" + complement + '\'' +
            ", zipCode='" + zipCode + '\'' +
            '}';
    }
}
