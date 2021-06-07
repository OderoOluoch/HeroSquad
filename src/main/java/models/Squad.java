package models;

import java.util.ArrayList;

public class Squad {
    private String name;
    private int size;
    private String cause;
    private int id;
    private ArrayList<Hero> heroes;

    public Squad(String name, int size, String cause){
        this.name = name;
        this.size = size;
        this.cause = cause;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(Hero hero) {
        heroes.add(hero);
    }




}
