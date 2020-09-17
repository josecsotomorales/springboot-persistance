package com.jose.persistance.data;

import javax.persistence.Entity;

@Entity
public class Shrub extends Plant {

    private int height;

    private int width;

    /* getters and setters*/

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
