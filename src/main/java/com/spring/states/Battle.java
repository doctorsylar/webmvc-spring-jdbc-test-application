package com.spring.states;

import com.spring.entity.mages.MageImpl;
import org.springframework.stereotype.Component;

@Component
public class Battle {

    private MageImpl mage1;
    private MageImpl mage2;

    private boolean mage2Priority;

    public void setMage1(MageImpl mage1) {
        this.mage1 = mage1;
    }

    public void setMage2(MageImpl mage2) {
        this.mage2 = mage2;
    }

    public MageImpl getMage1() {
        return mage1;
    }

    public MageImpl getMage2() {
        return mage2;
    }

    public boolean isMage2Priority() {
        return mage2Priority;
    }

    public void setMage2Priority(boolean mage2Priority) {
        this.mage2Priority = mage2Priority;
    }

    public void makeTurn () {
        if (!this.mage2Priority) {

        }
    }

}
