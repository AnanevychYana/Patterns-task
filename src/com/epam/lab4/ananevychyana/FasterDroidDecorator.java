package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;

public class FasterDroidDecorator extends DroidDecorator {
    private static final Logger LOG = Logger.getLogger(FasterDroidDecorator.class);
    public FasterDroidDecorator(Droid droid) {
        super(droid);
    }
    public void runFaster (Droid decoratorDroid){
        LOG.info("Move as a flash!!!");
    }

    @Override
    void move() {
        droid.move();
        runFaster(droid);
    }
}
