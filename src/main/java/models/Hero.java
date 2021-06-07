package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String weakness;
    private String powers;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;

    public Hero(String name, int age,String weakness, String powers){
        this.name = name;
        this.age = age;
        this.weakness = weakness;
        this.powers = powers;
        this.id = instances.size();
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public static ArrayList<Hero> getInstances() {
        return instances;
    }

    public static void setInstances(ArrayList<Hero> instances) {
        Hero.instances = instances;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
