package com.dchristofolli.zeromqmessaging.messaging;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client implements Serializable {
    private static final long serialVersionUID = -6225323635597752243L;
    private String id;
    private String name;
    private String logoUUID;
    private Address address;
    private List<Affiliate> affiliates = new ArrayList<>();

    public Client() {
    }

    public Client(String id, String name, String logoUUID, Address address) {
        this.id = id;
        this.name = name;
        this.logoUUID = logoUUID;
        this.address = address;
    }

    public void addAffiliate(Affiliate affiliate) {
        this.getAffiliates().add(affiliate);
    }

    public Client(String id, String name, String logoUUID, Address address, List<Affiliate> affiliates) {
        this.id = id;
        this.name = name;
        this.logoUUID = logoUUID;
        this.address = address;
        this.affiliates = affiliates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUUID() {
        return logoUUID;
    }

    public void setLogoUUID(String logoUUID) {
        this.logoUUID = logoUUID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Affiliate> getAffiliates() {
        return affiliates;
    }

    public void setAffiliates(List<Affiliate> affiliates) {
        this.affiliates = affiliates;
    }

    @Override
    public String toString() {
        return "Client{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", logoUUID='" + logoUUID + '\'' +
            ", address=" + address +
            ", affiliates=" + affiliates +
            '}';
    }
}
