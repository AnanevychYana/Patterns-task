package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class CommandDroid extends Droid {
    private static final Logger LOG = Logger.getLogger(CommandDroid.class);
    private int armyNumber = 14;
    private String rank = "captain";

    public CommandDroid () {
        name = "CommandDroid";
    }

    public CommandDroid (int armyNumber, String rank) {
        name = "CommandDroid";
        this.armyNumber = armyNumber;
        this.rank = rank;
    }

    @Override
    public void move() {
        LOG.info("Command droid stands still");
    }

    public Droid clone() {
        return new CommandDroid(armyNumber, rank);
    }

    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("Number of soldiers\t: " + armyNumber);
        LOG.info("Rank\t: " + rank);
    }
}
