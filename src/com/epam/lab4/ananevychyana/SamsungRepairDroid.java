package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class SamsungRepairDroid extends RepairDroid {
    private static final Logger LOG = Logger.getLogger(SamsungRepairDroid.class);
    private int repairSpeed = 18;
    public SamsungRepairDroid () {
        name = "SamsungRepairDroid";
    }

    public SamsungRepairDroid (int repairSpeed) {
        name = "SamsungRepairDroid";
        this.repairSpeed = repairSpeed;
    }

    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("Repair speed:\t: " + repairSpeed);
    }

    @Override
    public Droid clone() {
        return new SamsungRepairDroid(repairSpeed);
    }
}
