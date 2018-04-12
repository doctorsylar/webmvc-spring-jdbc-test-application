package com.spring.services;

import com.spring.entity.mages.MageImpl;

public interface BattleService {
    void beginBattle(MageImpl mage1, MageImpl mage2);
}
