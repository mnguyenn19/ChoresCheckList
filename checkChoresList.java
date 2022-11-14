/*
Student: Michelle Nguyen & Angel Trujillo
Professor: Allison Sullivan
Course: Software Testing and Maintenance
Date: Nov. 10, 2022
Assignment: Logic Based Testing
*/

import java.util.Scanner;

public class Main
{
    static int validInputCheck(int input) {
        Scanner reader = new Scanner(System.in);
        int key = 0;

        while(key == 0) {
            if(reader.hasNextInt()) {
                input = reader.nextInt();
                if((input == 0) || (input == 1)) {
                    key = 1;
                    return input;
                }

                while((input != 0) || (input != 1)) {
                    System.out.println("\nInvalid input. Enter input again: ");
                    input = reader.nextInt();
                    if((input == 0) || (input == 1)) {
                        key = 1;
                        return input;
                    }
                }
            }
            else {
                System.out.println("\nInvalid input. Exit program.");
                System.exit(0);
            }
        }
        return input;
    }
    public static void main(String[] args) {

        int response = 0;

        //morning chores
        int awake = 0;
        int bed = 0;
        int floor = 0;
        int vacuum = 0;
        int dishes = 0;
        int laundry = 0;

        //afternoon chores
        int stove = 0;
        int mail = 0;
        int openmail = 0;
        int kitchenCounter = 0;
        int trash = 0;
        int closeDrawers = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Are you checking for morning or afternoon chores?");
        System.out.println("\nEnter '0' for morning or '1' for afternoon.");
        response = reader.nextInt();

        if(response == 0) {
            //morning
            System.out.println("\nAre you awake? Enter '0' for no or '1' for yes: ");
            awake = validInputCheck(awake);

            System.out.println("\nDid you make your bed? Enter '0' for no or '1' for yes: ");
            bed = validInputCheck(bed);

            System.out.println("\nIs the floor dusty? Enter '0' for no or '1' for yes: ");
            floor = validInputCheck(floor);

            System.out.println("\nDid you vacuum? Enter '0' for no or '1' for yes: ");
            vacuum = validInputCheck(vacuum);

            System.out.println("\nDid you wash the dishes? Enter '0' for no or '1' for yes: ");
            dishes = validInputCheck(dishes);

            //System.out.println("\nDid you put your clothes in the laundry? Enter '0' for no or '1' for yes: ");
            //laundry = validInputCheck(laundry);

            if((awake == 1) && (bed == 1) && ((floor == 0) || ((floor == 1) && (vacuum == 1))) && (dishes == 1)) {
                System.out.println("\n\nYour morning chores are done.");
            }

            else {
                System.out.println("\n\nYou are not done with your chores.\n----------------------------------");
                int counter = 0;

                if(awake == 0) {
                    counter ++;
                    System.out.println(counter + ". You have to be awake to do your chores.");
                }
                if(bed == 0) {
                    counter ++;
                    System.out.println(counter + ". You still have to make your bed.");
                }
                if((floor == 1) && (vacuum == 0)) {
                    counter ++;
                    System.out.println(counter + ". The floor is dirty.");
                }
                if(dishes == 0) {
                    counter ++;
                    System.out.println(counter + ". The dishes need to be done.");
                }
                //if(laundry == 0) {
                //    counter ++;
                //    System.out.println(counter + ". There are dirty clothes that need to be washed.");
                //}
            }
        }

        else if(response == 1) {
            //afternoon
            System.out.println("\nDid you clean the stove top? Enter '0' for no or '1' for yes: ");
            stove = validInputCheck(stove);

            System.out.println("\nIs there mail in the mailbox? Enter '0' for no or '1' for yes: ");
            mail = validInputCheck(mail);

            System.out.println("\nDid you open your mail? Enter '0' for no or '1' for yes: ");
            openmail = validInputCheck(openmail);

            System.out.println("\nIs the kitchen counter clean? Enter '0' for no or '1' for yes: ");
            kitchenCounter = validInputCheck(kitchenCounter);

            System.out.println("\nIs the garbage disposed of? Enter '0' for no or '1' for yes: ");
            trash = validInputCheck(trash);

            System.out.println("\nAre all the drawers closed? Enter '0' for no or '1' for yes: ");
            closeDrawers = validInputCheck(closeDrawers);

            if((stove == 1) && ((mail == 0) || ((mail == 1) && (openmail == 1))) && (kitchenCounter == 1) && (trash == 1) && (closeDrawers == 1)) {

                System.out.println("\n\nYour afternoon chores are done.");
            }

            else {
                System.out.println("\n\nYou are not done with your chores.\n----------------------------------");
                int counterB = 0;

                if(stove == 0) {
                    counterB ++;
                    System.out.println(counterB + ". The stove is not clean.");
                }
                if((mail == 1) && (openmail == 0)) {
                    counterB ++;
                    System.out.println(counterB + ". You still need to read your mail.");
                }
                if(kitchenCounter == 0) {
                    counterB ++;
                    System.out.println(counterB + ". The kitchen counter is still dirty.");
                }
                if(trash == 0) {
                    counterB ++;
                    System.out.println(counterB + ". The trash needs to be emptied.");
                }
                if(closeDrawers == 0) {
                    counterB ++;
                    System.out.println(counterB + ". You have to close all the drawers.");
                }
            }
        }

        else {
            System.out.println("\nInvalid answer. Program ending.");
            System.exit(0);
        }
    }
}
