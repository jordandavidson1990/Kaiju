import Kaiju.Joffrey;
import Vehicle.Motorbike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    Joffrey joffrey;
    Motorbike motorbike;

    @Before
    public void setUp() throws Exception {
        joffrey = new Joffrey("Bob", 30, 20, "Huh");
        motorbike = new Motorbike("Davidson", 40, 20);
    }

    @Test
    public void motorbikeCanAttackKaiju() {
        motorbike.attack(joffrey);
        assertEquals(10, joffrey.getHealthValue());
    }

    @Test
    public void motorbikeCanBeAttacked() {
        motorbike.damage(joffrey.getAttackValue());
        assertEquals(20, motorbike.getHealthValue());
    }
}
