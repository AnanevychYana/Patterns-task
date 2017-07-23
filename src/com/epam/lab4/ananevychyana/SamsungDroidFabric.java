package com.epam.lab4.ananevychyana;

public class SamsungDroidFabric extends DroidAbstractFabric {
    @Override
    public BattleDroid getBattleDroid() {
        return new SamsungBattleDroid();
    }

    @Override
    public CommandDroid getCommandDroid() {
        return new SamsungCommandDroid();
    }

    @Override
    public RepairDroid getRepairDroid() {
        return new SamsungRepairDroid();
    }
}
