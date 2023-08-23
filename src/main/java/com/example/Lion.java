package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    //Feline feline = new Feline();
    private FelineInterface felineInterface;
    private AnimalInterface animalInterface;

    public Lion(FelineInterface felineInterface) {
        this.felineInterface = felineInterface;
    }
    public Lion(AnimalInterface animalInterface) {
        this.animalInterface = animalInterface;
    };

    public int getKittens() {
        return felineInterface.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animalInterface.getFood("Хищник");
    }
}
