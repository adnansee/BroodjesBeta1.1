package com.example.broodjesbeta;


import javax.persistence.*;

@Entity
@Table(name = "sandwiches")
public class Broodjes {

    @Id
    @GeneratedValue
    private int id;

    public Broodjes(String name) {
        this.name = name;
    }

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Broodjes() {
    }

    public Broodjes setName(String name) {
        this.name = name;
        return this;
    }
}
