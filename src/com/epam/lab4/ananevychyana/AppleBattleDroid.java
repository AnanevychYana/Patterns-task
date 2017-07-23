package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class AppleBattleDroid extends BattleDroid {
    private static final Logger LOG = Logger.getLogger(AppleBattleDroid.class);
    private int applePower = 100500;
    public AppleBattleDroid() {
        name = "AppleBattleDroid";
    }

    public AppleBattleDroid(int applePower) {
        name = "AppleBattleDroid";
        this.applePower = applePower;
    }

    @Override
    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("Apple power\t: " + applePower);
    }

    public Droid clone() {
        return new AppleBattleDroid(applePower);
    }
}
