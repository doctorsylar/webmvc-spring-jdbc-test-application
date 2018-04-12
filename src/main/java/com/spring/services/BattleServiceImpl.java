package com.spring.services;

import com.spring.entity.mages.MageImpl;
import com.spring.states.Battle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BattleServiceImpl implements BattleService {
    @Autowired
    Battle battle;

    @Override
    public void beginBattle(MageImpl mage1, MageImpl mage2) {
        this.battle.setMage1(mage1);
        this.battle.setMage1(mage2);
    }
}
