package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private final List<Animal> animalsToButch = new ArrayList<>();
    private final List<Animal> animalsInFarm;

    public Farm( List<Animal> animals ) {
        this.animalsInFarm = animals;
    }

    public void feedAnimals() {
        for (Animal animal : animalsInFarm) {
            animal.feed();
            if (animal.getSize() > 4) animalsToButch.add(animal);
        }
    }

    public void butcher( Butcher butcher ) {
        animalsInFarm.removeIf(animal -> animal.getSize() > 4);
    }

    public boolean isEmpty() {
        if(animalsInFarm.size()==0) return true;
        return false;
    }

    public List<String> getStatus() {
        List<String> animalStatuses = new ArrayList<>();

        for (Animal animal : this.animalsInFarm) {
            animalStatuses.add("There is a " + animal.getSize() + " sized " + animal.getClass().getSimpleName().toLowerCase() + " in the farm.");
        }

        return animalStatuses;
    }

    public List<Animal> getAnimals() {
        return animalsInFarm;
    }
}
