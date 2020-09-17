package com.jose.persistance.data;

import javax.persistence.*;

@Entity
@Table(name = "flower")
public class Flower extends Plant{

    private String color;

    /* getters and setters*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
