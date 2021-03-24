package com.codecool.farm.animal;

public class Pig extends Animal {
    private static final int SIZE_GROWTH_WHEN_FEED = 1;

    @Override
    public void feed() {
        super.setSize(SIZE_GROWTH_WHEN_FEED);
    }
}
