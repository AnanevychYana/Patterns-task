package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class AppleCommandDroid extends CommandDroid {
    private static final Logger LOG = Logger.getLogger(AppleCommandDroid.class);
    private String iOsVersion = "10.0";
    public AppleCommandDroid() {
        name = "AppleCommandDroid";
    }

    public AppleCommandDroid(String iOsVersion) {
        name = "AppleCommandDroid";
        this.iOsVersion = iOsVersion;
    }

    public void printInfo () {
        LOG.info("Name\t: " + name);
        LOG.info("iOS version\t: " + iOsVersion);
    }

    public Droid clone() {
        return new AppleCommandDroid(iOsVersion);
    }
}
