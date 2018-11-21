package Kaiju;

import Behaviours.IDamage;
import Kaiju.Behaviours.IFly;

public class Jeffrey extends Kaiju implements IFly {
    public Jeffrey(String name, int healthValue, int attackValue, String roar) {
        super(name, healthValue, attackValue, roar);
    }

    public String roar() {
        return "Roar";
    }

    public String fly() {
        return "I can fly!";
    }


//
//    public void damage(int damage) {
//        this.setHealthValue(this.getHealthValue()-damage);
//    }
//
//    public void attack(IDamage damage) {
//        damage.setHealthValue(damage.getHealthValue()-this.getAttackValue());
//    }
}
