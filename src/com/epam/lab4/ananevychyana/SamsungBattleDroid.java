package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class SamsungBattleDroid extends BattleDroid {
    private static final Logger LOG = Logger.getLogger(SamsungBattleDroid.class);
    private int blasterPower = 25;
    public SamsungBattleDroid () {
        name = "SamsungBattleDroid";
    }

    public SamsungBattleDroid (int blasterPower) {
        name = "SamsungBattleDroid";
        this.blasterPower = blasterPower;
    }

    @Override
    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("Blaster power\t: " + blasterPower);
    }

    @Override
    public Droid clone() {
        return new SamsungBattleDroid(blasterPower);
    }
}
