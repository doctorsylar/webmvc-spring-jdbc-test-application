package com.spring.entity.mages;

import java.util.HashMap;
import java.util.Map;

public class MageImpl implements Mage {
    private int id;
    private String name;
    private int healthMax;
    private int healthCurrent;
    private int healthModifier;
    private int speed;
    private int speedModifier;
    private int attackLevel;
    private int damageModifier;
    private int defenceLevel;
    private int baseDefenceModifier;
    private int buffLevel;

    private boolean baseDefenceActivated;
    private boolean energyDefenceActivated;
    private boolean buffActivated;

    private int level;

    private Map<String, String> inventory;

    private String className;

    public MageImpl() {
        this.name = "";
        this.healthCurrent = this.healthMax;
        this.healthModifier = 0;
        this.speed = 0;
        this.speedModifier = 0;
        this.attackLevel = 0;
        this.damageModifier = 0;
        this.defenceLevel = 0;
        this.baseDefenceModifier = 0;
        this.buffLevel = 0;
        this.inventory = new HashMap<>();
        this.inventory.put("Stuff", "");
        this.inventory.put("Robe", "");
        this.inventory.put("ActiveItem1", "");
        this.inventory.put("ActiveItem2", "");
        this.className = this.getClass().getSimpleName();
        this.setLevel();
    }

    public MageImpl(String name, int speed, int attackLevel,
                    int defenceLevel, int buffLevel) {
        this.name = name;
        this.speed = speed;
        this.attackLevel = attackLevel;
        this.defenceLevel = defenceLevel;
        this.buffLevel = buffLevel;



        // Health points
        this.healthMax = 10;
        if (this.attackLevel == 2) {
            this.healthMax = 15;
        }
        else if (this.attackLevel == 3) {
            this.healthMax = 20;
        }
        this.healthCurrent = this.healthMax;

        // Creating empty inventory slots
        this.inventory = new HashMap<>();
        this.inventory.put("Stuff", "");
        this.inventory.put("Robe", "");
        this.inventory.put("ActiveItem1", "");
        this.inventory.put("ActiveItem2", "");

        this.setLevel();
    }



    public void fillInventory (String stuff, String robe,
                               String item1, String item2) {
        this.inventory.put("Stuff", stuff);
        this.inventory.put("Robe", robe);
        this.inventory.put("ActiveItem1", item1);
        this.inventory.put("ActiveItem2", item2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public int getHealthCurrent() {
        return healthCurrent;
    }

    public int getHealthModifier() {
        return healthModifier;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpeedModifier() {
        return speedModifier;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public int getBaseDefenceModifier() {
        return baseDefenceModifier;
    }

    public int getBuffLevel() {
        return buffLevel;
    }

    public boolean isBaseDefenceActivated() {
        return baseDefenceActivated;
    }

    public boolean isEnergyDefenceActivated() {
        return energyDefenceActivated;
    }

    public boolean isBuffActivated() {
        return buffActivated;
    }

    public int getLevel() {
        return level;
    }

    public Map<String, String> getInventory() {
        return inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth () {
        this.healthMax = 10;
        if (this.attackLevel == 2) {
            this.healthMax = 15;
        }
        else if (this.attackLevel == 3) {
            this.healthMax = 20;
        }
        this.healthCurrent = this.healthMax;
    }

    public void setHealthMax(int healthMax) {
        this.healthMax = healthMax;
    }

    public void setHealthCurrent(int healthCurrent) {
        this.healthCurrent = healthCurrent;
    }

    public void setHealthModifier(int healthModifier) {
        this.healthModifier = healthModifier;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpeedModifier(int speedModifier) {
        this.speedModifier = speedModifier;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    public void setBaseDefenceModifier(int baseDefenceModifier) {
        this.baseDefenceModifier = baseDefenceModifier;
    }

    public void setBuffLevel(int buffLevel) {
        this.buffLevel = buffLevel;
    }

    public void setBaseDefenceActivated(boolean baseDefenceActivated) {
        this.baseDefenceActivated = baseDefenceActivated;
    }

    public void setEnergyDefenceActivated(boolean energyDefenceActivated) {
        this.energyDefenceActivated = energyDefenceActivated;
    }

    public void setBuffActivated(boolean buffActivated) {
        this.buffActivated = buffActivated;
    }

    public void setLevel() {
        for (int i = 1,
             s = this.speed - 3,
             a = this.attackLevel,
             d = this.defenceLevel,
             b = this.buffLevel;
             i <= 3; i++) {
            a--;
            d--;
            b--;
            s--;
            if (a >= 0) {
                this.level += i;
            }
            if (d >= 0) {
                this.level += i;
            }
            if (b >= 0) {
                this.level += i;
            }
            if (s >= 0) {
                this.level += i;
            }
        }
    }

    public void setInventory(Map<String, String> inventory) {
        this.inventory = inventory;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    @Override
    public void attack(Mage enemy) {

    }

    @Override
    public void castBaseDefence() {

    }

    @Override
    public void castEnergyDefence() {

    }

    @Override
    public void castBuff() {

    }

    @Override
    public void castElemental() {

    }
}
