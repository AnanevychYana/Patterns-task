package com.epam.lab4.ananevychyana;

public abstract class DroidDecorator {
    protected Droid droid;

    public DroidDecorator(Droid droid) {
        this.droid = droid;
    }
    void move (){
        droid.move();
    }
}
