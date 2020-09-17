package com.dchristofolli.zeromqmessaging.messaging;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Affiliate implements Serializable {
    private static final long serialVersionUID = 7011534655620886292L;
    private String id;
    private String name;
    private List<String> responsibles = new ArrayList<>();
    private Address address;

    public Affiliate() {
    }

    public Affiliate(String id, String name, List<String> responsibles, Address address) {
        this.id = id;
        this.name = name;
        this.responsibles = responsibles;
        this.address = address;
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

    public List<String> getResponsibles() {
        return responsibles;
    }

    public void setResponsibles(List<String> responsibles) {
        this.responsibles = responsibles;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Affiliate{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", responsibles=" + responsibles +
            ", address=" + address +
            '}';
    }
}