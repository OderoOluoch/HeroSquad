package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquadTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void NewSquadObjectGetsCorrectlyCreated_true() throws  Exception{
        Squad squad = new Squad("Vipers",4,"Women power");
        assertEquals(true,squad instanceof Squad);
    }

    @Test
    public void SquadInstantiatesWithCorrectName_true() throws Exception{
        Squad squad = new Squad("Vipers",4,"Women power");
        assertEquals("Odero",squad.getName());
    }
}