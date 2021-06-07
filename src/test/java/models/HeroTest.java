package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    public void NewHeroObjectGetsCorrectlyCreated_true(){
        Hero hero = new Hero("Odero",24,"Light","Eyes");
        assertEquals(true,hero instanceof Hero);
    }

}