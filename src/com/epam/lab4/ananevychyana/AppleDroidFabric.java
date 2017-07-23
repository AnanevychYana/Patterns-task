package com.epam.lab4.ananevychyana;

public class AppleDroidFabric extends DroidAbstractFabric {
    @Override
    public BattleDroid getBattleDroid() {
        return new AppleBattleDroid();
    }

    @Override
    public CommandDroid getCommandDroid() {
        return new AppleCommandDroid();
    }

    @Override
    public RepairDroid getRepairDroid() {
        return new AppleRepairDroid();
    }
}
