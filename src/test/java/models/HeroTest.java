package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void NewHeroObjectGetsCorrectlyCreated_true() throws  Exception{
        Hero hero = new Hero("Odero",24,"Light","Eyes");
        assertEquals(true,hero instanceof Hero);
    }

    @Test
    public void HeroInstantiatesWithCorrectName_true() throws Exception{
        Hero hero = new Hero("Odero",24,"Light","Eyes");
        assertEquals("Odero",hero.getName());
    }

    @Test
    public void PostInstantiatesWithCorrectPowers_true() throws Exception{
        Hero hero = new Hero("Odero",24,"Light","Eyes");
        assertEquals("Eyes",hero.getPowers());
    }

    @Test
    public void PostInstantiatesWithCorrectAge_true() throws Exception{
        Hero hero = new Hero("Odero",24,"Light","Eyes");
        assertEquals(24,hero.getAge());
    }

    @Test
    public void PostInstantiatesWithCorrectId_true() throws Exception{
        Hero hero = new Hero("Odero",24,"Light","Eyes");
        assertEquals(4,hero.getId());
    }

    @Test
    public void PostInstantiatesWithCorrectWeakness_true() throws Exception{
        Hero hero = new Hero("Odero",24,"Light","Eyes");
        assertEquals("Light",hero.getWeakness());
    }

}