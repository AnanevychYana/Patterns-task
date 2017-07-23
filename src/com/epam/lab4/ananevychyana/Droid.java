package com.epam.lab4.ananevychyana;

public abstract class Droid implements DroidPrototype {
    protected String name;
    public abstract void printInfo();
    public abstract Droid clone();
    public abstract void move ();

}
