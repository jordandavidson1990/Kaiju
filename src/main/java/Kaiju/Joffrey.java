package Kaiju;

import Behaviours.IDamage;
import Kaiju.Behaviours.IMove;

public class Joffrey extends Kaiju implements IMove {

    public Joffrey(String name, int healthValue, int attackValue, String roar) {
        super(name, healthValue, attackValue, roar);
    }

    public String roar() {
        return "Raar";
    }

    public String move() {
        return "I can move!";
    }

//    public void damage(int damage) {
//        this.setHealthValue(this.getHealthValue()-damage);
//    }
//    public void attack(IDamage damage) {
//        damage.setHealthValue(damage.getHealthValue()-this.getAttackValue());
//    }
}
