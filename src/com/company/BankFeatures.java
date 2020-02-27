package com.company;

import java.util.Scanner;

public class BankFeatures {

    /*public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();

    }*/

    static double balance = 0;
    static double takeCash;
    static double addCash;
    static double sum;
    static Scanner Scan = new Scanner(System.in);

    public static void viewBalance() {

        //clearScreen();
        System.out.println("Your balance is " +balance);
    }

    public static void depositCash() {


        System.out.println("How much would you like to deposit?");

        try {
            addCash = Scan.nextDouble();
            sum = addCash+balance;

            System.out.println("you deposit " +addCash + ", was earlier " +balance +". Is now "+sum);
            balance=sum;
            System.out.println("Balance is now "+balance);
        }
        catch (Exception e){
            System.out.println("Invalid amount");
        }


    }

    public static void withdrawalCash() {


        System.out.println("How much would you like to withdrawal?");

        try {
            takeCash = Scan.nextDouble();
            sum = takeCash-balance;
            if (sum >=0) {
                System.out.println("Your current balance is " +sum);
            }
            else{
                System.out.println("Insufficient cash, withdrawal lower amount");
            }
        }
        catch (Exception e){
            System.out.println("You entered wrong format");
        }

    }

    public static void exitApp() {
        System.exit(0);
    }
}
