package com.spring.entity.mages;

public class FireMage extends AbstractMageImpl {

    public FireMage() {
        super();
    }

    public FireMage(String name, int speed, int attackLevel, int defenceLevel, int buffLevel) {
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
