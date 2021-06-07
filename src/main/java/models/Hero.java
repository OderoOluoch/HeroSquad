package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String weakness;
    private String powers;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;

    public Hero(String name, int age,String weakness, String powers, int id){
        this.name = name;
        this.age = age;
        this.weakness = weakness;
        this.powers = powers;
        this.id = id;
        instances.add(this);
    }

}
