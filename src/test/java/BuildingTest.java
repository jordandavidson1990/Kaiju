import Buildings.Building;
import Kaiju.Joffrey;
import Vehicle.Motorbike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    Building building;
    Joffrey joffrey;

    @Before
    public void setUp() throws Exception {
        building = new Building(50);
        joffrey = new Joffrey("Harley", 30, 10, "Growl");
    }

    @Test
    public void buildingCanBeAttacked() {
        building.damage(joffrey.getAttackValue());
        assertEquals(40, building.getHealthValue());
    }
}
