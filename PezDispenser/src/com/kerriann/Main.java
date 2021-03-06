package com.kerriann;

public class Main {

    public static void main(String[] args) {
        System.out.println("We are making a new PEZ dispenser");
        System.out.printf("There are %d pez allowed in every dispenser %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Yoda");

        System.out.printf("The dispenser is %s \n", dispenser.getCharacterName());

        if(dispenser.isEmpty()) {
            System.out.printf("Dispenser is empty! %n");
        }

        System.out.printf("Filling the dispenser with delicious pez.. %n");
        dispenser.fill();

        if (!dispenser.isEmpty()) {
            System.out.printf("Dispenser is full! %n");
        }

        while(dispenser.dispense()) {
            System.out.println("Chaomp!");
        }

        if(dispenser.isEmpty()) {
            System.out.println("Ate all the PEZ!");
        }

        dispenser.fill(4);
        dispenser.fill(2);

        while(dispenser.dispense()) {
            System.out.println("Chaomp!");
        }

        try {
            dispenser.fill(30);
        } catch(IllegalArgumentException iae) {
            System.out.println("Whoa there!!");
            System.out.printf("The error was: %s %n", iae.getMessage());
        }
    }
}
