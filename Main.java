/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

//Did research on how to get user to input proper input but I found the research confusing and 
//when trying to implement it into my code it would not work.

package com.baccalculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double weight, totalAlcoholConsumed, timeSinceLastDrink;
        double ratioMan = 0.73;
        double ratioWoman = 0.66;
        double BACMan;
        double BACFemale;

        String gender;
        String man = "M";
        String female = "F";

        Scanner q1 = new Scanner(System.in);
        System.out.print("Enter your weight (in pounds): ");
        weight = q1.nextDouble();

        Scanner q2 = new Scanner(System.in);
        System.out.print("Enter your gender (M or F): ");
        gender = q2.nextLine();

        Scanner q3 = new Scanner(System.in);
        System.out.print("Enter total alcohol consumed (in ounces): ");
        totalAlcoholConsumed = q3.nextDouble();

        Scanner q4 = new Scanner(System.in);
        System.out.print("Enter time since last drink: ");
        timeSinceLastDrink = q4.nextDouble();

        BACMan = (totalAlcoholConsumed * 5.14 / weight * ratioMan) - 0.015 * timeSinceLastDrink;
        BACFemale = (totalAlcoholConsumed * 5.14 / weight * ratioWoman) - 0.015 * timeSinceLastDrink;

        if (man.equalsIgnoreCase(gender) && BACMan >= 0.08) {

            System.out.print("Your BAC is " + BACMan);
            System.out.println("");
            System.out.print("You cannot legally drive.");

        }

        if (man.equalsIgnoreCase(gender) && BACMan < 0.08) {

            System.out.print("Your BAC is " + BACMan);
            System.out.println("");
            System.out.print("You can legally drive.");

        }

        if (female.equalsIgnoreCase(gender) && BACFemale >= 0.08) {

            System.out.print("Your BAC is " + BACFemale);
            System.out.println("");
            System.out.print("You cannot legally drive.");

        }

        if (female.equalsIgnoreCase(gender) && BACFemale < 0.08) {

            System.out.print("Your BAC is " + BACFemale);
            System.out.println("");
            System.out.print("You can legally drive.");

        }

    }


}
