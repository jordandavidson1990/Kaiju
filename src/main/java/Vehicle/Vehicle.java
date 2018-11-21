package Vehicle;

import Behaviours.IAttack;
import Behaviours.IDamage;

public abstract class Vehicle implements IDamage, IAttack {

    private String type;
    private int healthValue;
    private int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
    public void attack(IDamage damage) {
        damage.setHealthValue(damage.getHealthValue()-this.getAttackValue());
    }

    public void damage(int damage) {
        this.setHealthValue(this.getHealthValue()-damage);
    }
}
