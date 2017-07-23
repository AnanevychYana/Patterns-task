package com.epam.lab4.ananevychyana;

public class BattleDroidAdapterFromRepairDroid extends BattleDroid {
    RepairDroid repairDroid = null;
    BattleDroidAdapterFromRepairDroid (RepairDroid repairDroid) {
        this.repairDroid = repairDroid;
    }

    @Override
    public void performBattleDroidLanding () {
        repairDroid.performRepairDroidLanding();
    }
}