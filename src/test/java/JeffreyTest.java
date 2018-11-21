import Behaviours.IDamage;
import Kaiju.Jeffrey;
import Kaiju.Joffrey;
import Vehicle.Jeep;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JeffreyTest {

    Jeffrey jeffrey;
    Jeep jeep;
    Joffrey joffrey;

    @Before
    public void setUp() throws Exception {
        jeffrey = new Jeffrey("Jeff", 10, 5, "Roar");
        joffrey = new Joffrey("Joff", 50, 5, "Jim");
        jeep = new Jeep("A4", 10, 5);
    }

    @Test
    public void canRoar() {
        assertEquals("Roar", jeffrey.roar());
    }

    @Test
    public void canFly() {
        assertEquals("I can fly!", jeffrey.fly());
    }

    @Test
    public void canAttackJeep() {
        jeffrey.attack(jeep);
        assertEquals(5, jeep.getHealthValue());
    }

    @Test
    public void canBeAttackedByJeep() {
        jeffrey.damage(jeep.getAttackValue());
        assertEquals(5, jeffrey.getHealthValue());
    }

    @Test
    public void kaijuCanAttackKaiju() {
        joffrey.attack(jeffrey);
        jeffrey.attack(joffrey);
        assertEquals(5, jeffrey.getHealthValue());
        assertEquals(45, joffrey.getHealthValue());
    }
}
