package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class AppleRepairDroid extends RepairDroid {
    private static final Logger LOG = Logger.getLogger(AppleRepairDroid.class);
    private int healingSpeed = 18;
    public AppleRepairDroid() {
        name = "AppleRepairDroid";
    }

    public AppleRepairDroid(int healingSpeed) {
        name = "AppleRepairDroid";
        this.healingSpeed = healingSpeed;
    }

    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("Healing speed:\t: " + healingSpeed);
    }

    @Override
    public Droid clone() {
        return new AppleRepairDroid(healingSpeed);
    }
}
