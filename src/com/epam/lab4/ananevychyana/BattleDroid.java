package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class BattleDroid extends Droid {
    private static final Logger LOG = Logger.getLogger(BattleDroid.class);
    private int power = 5;

    public BattleDroid () {
        name = "BattleDroid";
    }

    public BattleDroid (int power) {
        name = "BattleDroid";
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Droid clone() {
        return new BattleDroid(power);
    }

    @Override
    public String toString () {
        return "Name: " + name + "    Power:" + power;
    }

    @Override
    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("Power\t: " + power);
    }

    @Override
    public void move() {
        LOG.info("Battle droid moves quickly");
    }

    public void performBattleDroidLanding() {
        LOG.info("BattleDroid is performing landing...");
    }
}
