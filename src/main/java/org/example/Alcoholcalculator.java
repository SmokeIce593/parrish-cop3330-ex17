/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class Alcoholcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BAC = 0;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        while (!input.hasNextInt()) {
            input.nextLine();
        }
        int gender = input.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        while (!input.hasNextInt()) {
            input.nextLine();
        }
        int consumption = input.nextInt();


        System.out.print("What is your weight, in pounds? ");
        while (!input.hasNextInt()) {
            input.nextLine();
        }
        int weight = input.nextInt();


        System.out.print("How many hours has it been since your last drink? ");
        while (!input.hasNextInt()) {
            input.nextLine();
        }
        int time = input.nextInt();



        if (gender == 1){
            BAC = 0.73 * (consumption * 5.14)/(weight) -0.015 * time;
            System.out.printf("Your BAC is %.6f", BAC);

        }
        else if (gender ==2) {
            BAC = 0.66 * (consumption * 5.14) / (weight) - 0.015 * time;
            System.out.printf("Your BAC is %.6f", BAC);

            if (BAC >= 0.08) {
                System.out.print("It is not legal for you to drive");
            }
        }

        if (BAC >= 0.08){
            System.out.print("\nIt is not legal for you to drive");
        }
        else {
            System.out.print("\n1It is legal for you to drive");
        }

    }
}
