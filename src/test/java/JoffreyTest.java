import Buildings.Building;
import Kaiju.Joffrey;
import Vehicle.Motorbike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoffreyTest {

    Joffrey joffrey;
    Motorbike motorbike;
    Building building;

    @Before
    public void setUp() throws Exception {
        joffrey = new Joffrey("Joff", 20, 15, "Raar");
        motorbike = new Motorbike("Harley", 20, 2);
        building = new Building(50);
    }

    @Test
    public void canRoar() {
        assertEquals("Raar", joffrey.roar());
    }

    @Test
    public void canMove() {
        assertEquals("I can move!", joffrey.move());
    }

    @Test
    public void joffreyCanAttackMotorbike() {
        joffrey.attack(motorbike);
        assertEquals(5, motorbike.getHealthValue());
    }

    @Test
    public void canAttackBuilding() {
        joffrey.attack(building);
        assertEquals(35, building.getHealthValue());
    }
}
