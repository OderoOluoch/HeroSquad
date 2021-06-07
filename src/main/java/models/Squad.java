package models;

import java.util.ArrayList;

public class Squad {
    private String name;
    private int size;
    private String cause;
    private ArrayList<Hero> heroes;

    public Squad(String name, int size, String cause){
        this.name = name;
        this.size = size;
        this.cause = cause;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(Hero hero) {
        heroes.add(hero);
    }




}
