package com.example;

public class main {
    public static void main(String[] args) throws Exception {
        Lion lion = new Lion((FelineInterface) new Feline());
        System.out.println(lion.getKittens());
        Lion lion1 = new Lion((AnimalInterface) new Feline());
        System.out.println(lion1.getFood());
    }
}
