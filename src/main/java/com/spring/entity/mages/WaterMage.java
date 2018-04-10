package com.spring.entity.mages;

public class WaterMage extends AbstractMageImpl {
    public WaterMage() {
    }

    public WaterMage(String name, int speed, int attackLevel, int defenceLevel, int buffLevel) {
        super(name, speed, attackLevel, defenceLevel, buffLevel);
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
