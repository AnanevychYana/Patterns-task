package com.epam.lab4.ananevychyana;

import org.apache.log4j.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("==== Choose the option ====");
            System.out.println("1. Test Fabric method pattern;");
            System.out.println("2. Test Abstract fabric pattern;");
            System.out.println("3. Test Prototype pattern;");
            System.out.println("4. Test Decorator pattern;");
            System.out.println("5. Test Adapter pattern;");
            System.out.println("Choose other option to exit.");
            choice = scanner.nextInt();
            if (choice == 1) {
                testFabricMethodPattern();
            } else if (choice == 2) {
                testAbstractFabricPattern();
            } else if (choice == 3) {
                testPrototypePattern();
            } else if (choice == 4) {
                testDecoratorPattern();
            } else if (choice == 5) {
                testAdapterPattern();
            } else {
                break;
            }
        }
//        testFabricMethodPattern();
//        testAbstractFabricPattern();
//        testPrototypePattern();
//        testDecoratorPattern();
//        testAdapterPattern();
    }

    public static void testFabricMethodPattern () {
        Scanner scanner = new Scanner(System.in);
        Droid selectedDroid = null;
        int choice = 0;
        Map<Integer, DroidTypes> choiceDroidTypeMap = new HashMap<>();
        choiceDroidTypeMap.put(1, DroidTypes.BATTLE_DROID);
        choiceDroidTypeMap.put(2, DroidTypes.REPAIR_DROID);
        choiceDroidTypeMap.put(3, DroidTypes.COMMAND_DROID);

        do {
            LOG.info("Enter what droid to create and print info:");
            LOG.info("1. Battle Droid");
            LOG.info("2. Repair Droid");
            LOG.info("3. Command Droid");
            LOG.info("\n9. Exit");
            choice = scanner.nextInt();
            if (choice != 9) {
                selectedDroid = DroidFabric.getDroid(choiceDroidTypeMap.get(choice));
            }
            if (selectedDroid != null)
                selectedDroid.printInfo();
            selectedDroid = null;
        } while (choice != 9);
    }

    public static void testAbstractFabricPattern () {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        Map<ManufacturerType, DroidAbstractFabric> droidFabricsMap = new HashMap<>();
        droidFabricsMap.put(ManufacturerType.APPLE, new AppleDroidFabric());
        droidFabricsMap.put(ManufacturerType.SAMSUNG, new SamsungDroidFabric());

        do {
            LOG.info("Enter which manufacturer droids to create.");
            LOG.info("1. Apple;");
            LOG.info("2. Samsung;");
            LOG.info("\n9. Exit");
            choice = scanner.nextInt();
            if (choice != 9) {
                if (choice == 1) {
                    droidFabricsMap.get(ManufacturerType.APPLE).getRepairDroid();
                    droidFabricsMap.get(ManufacturerType.APPLE).getCommandDroid();
                    droidFabricsMap.get(ManufacturerType.APPLE).getBattleDroid();
                } else if (choice == 2) {
                    droidFabricsMap.get(ManufacturerType.SAMSUNG).getRepairDroid();
                    droidFabricsMap.get(ManufacturerType.SAMSUNG).getCommandDroid();
                    droidFabricsMap.get(ManufacturerType.SAMSUNG).getBattleDroid();
                }
            }
        } while (choice != 9);
    }

    public static void testPrototypePattern () {
        BattleDroid battleDroid = new BattleDroid();
        battleDroid.setPower(25);
        LOG.info("Original battle droid:\n" + battleDroid);
        Droid clonedDroid = battleDroid.clone();
        LOG.info("Cloned battle droid:\n" + clonedDroid);
    }

    public static void testDecoratorPattern() {
        Droid battleDroid = new BattleDroid();
        battleDroid.move();
        DroidDecorator decorator  = new FasterDroidDecorator(battleDroid);
        decorator.move();
        Droid repairDroid = new RepairDroid();
        repairDroid.move();
        DroidDecorator decorator2  = new FasterDroidDecorator(repairDroid);
        decorator2.move();
        Droid commandDroid = new CommandDroid();
        commandDroid.move();
        DroidDecorator decorator3  = new FasterDroidDecorator(commandDroid);
        decorator3.move();

    }

    public static void testAdapterPattern () {
        BattleDroidPort port = new BattleDroidPort();
        BattleDroid battleDroid = new BattleDroid();
        RepairDroid repairDroid = new RepairDroid();
        BattleDroidAdapterFromRepairDroid adaptedRepairDroid = new BattleDroidAdapterFromRepairDroid(repairDroid);
        port.receiveBattleDroid(battleDroid);
        port.receiveBattleDroid(adaptedRepairDroid);
    }
}
