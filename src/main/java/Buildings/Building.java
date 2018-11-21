package Buildings;

import Behaviours.IDamage;

public class Building implements IDamage {

    private int healthValue;

    public Building(int healthValue) {
        this.healthValue = healthValue;
    }

    public void damage(int attackValue) {
        this.setHealthValue(this.getHealthValue()-attackValue);
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
