package com.epam.lab4.ananevychyana;

public class DroidFabric {
    public static Droid getDroid (DroidTypes droidType) {
        Droid createdDroid;

        if (droidType == DroidTypes.BATTLE_DROID) {
            createdDroid = new BattleDroid();
        } else if (droidType == DroidTypes.COMMAND_DROID) {
            createdDroid = new CommandDroid();
        } else if (droidType == DroidTypes.REPAIR_DROID) {
            createdDroid = new RepairDroid();
        } else {
            createdDroid = new BattleDroid();
        }

        return createdDroid;
    }
}
