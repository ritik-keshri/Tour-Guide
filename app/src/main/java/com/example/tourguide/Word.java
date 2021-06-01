package com.example.tourguide;

public class Word {
    private String name;
    private int address, image = -1, inf;

    public Word(String name, int address, int image) {
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public Word(String name, int address, int image, int inf) {
        this.name = name;
        this.inf = inf;
        this.image = image;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getInf() {
        return inf;
    }

    public int getImage() {
        return image;
    }

    public int getAddress() {
        return address;
    }
}
