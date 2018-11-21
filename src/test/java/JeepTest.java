import Kaiju.Jeffrey;
import Vehicle.Jeep;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JeepTest {

    Jeep jeep;
    Jeffrey jeffrey;

    @Before
    public void setUp() throws Exception {
        jeep = new Jeep("A4", 20, 20);
        jeffrey = new Jeffrey("Jeff", 50, 10, "Grrrr");
    }

    @Test
    public void jeepCanAttackKaiju() {
        jeep.attack(jeffrey);
        assertEquals(30, jeffrey.getHealthValue());
    }

    @Test
    public void KaijuCanAttackJeep() {
        jeep.damage(jeffrey.getAttackValue());
        assertEquals(10, jeep.getHealthValue());
    }
}
