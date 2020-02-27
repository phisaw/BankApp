package com.company;

import java.util.Scanner;

public class BankFeatures {

    static double balance = 0;
    static double takeCash;
    static double addCash;
    static double sum;
    static Scanner Scan = new Scanner(System.in);

    public static void viewBalance() {

        System.out.println("Your balance is " +balance);
    }

    public static void depositCash() {


        System.out.println("How much would you like to deposit?");

        try {
            addCash = Scan.nextDouble();
            sum = addCash+balance;
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
                System.out.println("Your current balnce is " +sum);
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
