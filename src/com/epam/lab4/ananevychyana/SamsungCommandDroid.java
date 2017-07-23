package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;

import java.util.List;

public class SamsungCommandDroid extends CommandDroid {
    private static final Logger LOG = Logger.getLogger(SamsungCommandDroid.class);
    private String androidVersion = "6.0.1";
    public SamsungCommandDroid () {
        name = "SamsungCommandDroid";
    }

    public SamsungCommandDroid (String androidVersion) {
        name = "SamsungCommandDroid";
        this.androidVersion = androidVersion;
    }

    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("Android version\t: " + androidVersion);
    }

    @Override
    public Droid clone() {
        return new SamsungCommandDroid(androidVersion);
    }
}
