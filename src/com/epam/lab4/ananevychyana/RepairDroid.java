package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class RepairDroid extends Droid {
    private static final Logger LOG = Logger.getLogger(RepairDroid.class);
    private int charge = 100;
    private float speed = 5.5f;

    public RepairDroid () {
        name = "RepairDroid";
    }

    public RepairDroid (int charge, float speed) {
        name = "RepairDroid";
        this.charge = charge;
        this.speed = speed;
    }

    public Droid clone() {
        return new RepairDroid(charge, speed);
    }

    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("Charge\t: " + charge + "%");
        LOG.info("Speed\t: " + speed + "km/h");
    }

    @Override
    public void move() {
        LOG.info("Repair droid moves slowly");
    }

    public void performRepairDroidLanding () {
        LOG.info("Repair Droid is performing landing...");
    }
}
