package Kaiju;

import Behaviours.IAttack;
import Behaviours.IDamage;

public abstract class Kaiju implements IAttack, IDamage {

    private String name;
    private int healthValue;
    private int attackValue;
    private String roar;

    public Kaiju(String name, int healthValue, int attackValue, String roar) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.roar = roar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }


    public String getRoar() {
        return roar;
    }

    public abstract String roar();

    public void attack(IDamage damage) {
        damage.setHealthValue(damage.getHealthValue()-this.getAttackValue());
    }

    public void damage(int damage) {
        this.setHealthValue(this.getHealthValue()-damage);
    }

}
