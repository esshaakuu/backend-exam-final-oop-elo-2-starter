package com.codecool.farm.animal;

public abstract class Animal implements Feedable {
    int size = 0;

    public Animal() {}

    public int getSize() {
        return this.size;
    }

    protected void setSize(int increaseSizeWith) {
        this.size = this.size + increaseSizeWith;
    }

}
