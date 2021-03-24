package com.codecool.farm.animal;

public class Cattle extends Animal {
    private static final int SIZE_GROWTH_WHEN_FEED = 2;

    @Override
    public void feed() {
        super.setSize(SIZE_GROWTH_WHEN_FEED);
    }
}
