package Vehicle;

import Behaviours.IDamage;

public class Jeep extends Vehicle {
    public Jeep(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

//
//    public void attack(IDamage damage) {
//        damage.setHealthValue(damage.getHealthValue()-this.getAttackValue());
//    }
//
//    public void damage(int damage) {
//        this.setHealthValue(this.getHealthValue()-damage);
//    }


}
