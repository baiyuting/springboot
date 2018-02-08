package com.example.demo.test3;

public class TestEnum {

    public static void main(String[] args) {
        Animal[] animals = Animal.values();
        for (Animal a :
                animals) {
            System.out.println(a);
        }
    }


}

enum Animal{
    CAT,DOG,SHEEP;
}
