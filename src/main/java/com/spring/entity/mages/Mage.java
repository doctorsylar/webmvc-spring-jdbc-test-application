package com.spring.entity.mages;

public interface Mage {
    void attack(Mage enemy);

    void castBaseDefence();

    void castEnergyDefence();

    void castBuff();

    void castElemental();

    void fillInventory (String stuff, String robe,
                        String item1, String item2);
//    void endTurn();
}
