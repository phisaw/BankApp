package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankFeatures {

    /*public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();

    }*/

    static double balance = 0;
    static double sum;
    static Scanner Scan = new Scanner(System.in);

    public static void viewBalance() {

        //clearScreen();
        System.out.println("Your balance is " +balance);
    }

    public static void depositCash() {
        double addCash;

        System.out.println("How much would you like to deposit?");

        try {
            addCash = Scan.nextDouble();

                if (addCash >=0) {
                sum = addCash+balance;
                System.out.println("you deposit " +addCash + ", was earlier " +balance +". Is now "+sum);
                balance=sum;
                System.out.println("Balance is now "+balance);
                }
                else {
                System.out.println("Try to enter another amount");

                }

            }
        catch (InputMismatchException ex){
            System.out.println("Error: invalid amount");
        }
 }

    public static void withdrawalCash() {
        double takeCash;

        boolean loop = true;
        do {
            System.out.println("Current balance is " +balance);
            System.out.println("How much would you like to withdrawal?");

            try {
                takeCash = Scan.nextDouble();

                if ((balance >= takeCash) && (takeCash >= 0)) {
                    sum = balance-takeCash;
                    System.out.println("you withdrawal " +takeCash + ", previous balance was " +balance +". Now "+sum);
                    balance=sum;
                    System.out.println("Your current balance is now " +balance);
                    loop =false;
                }
                else{
                    System.out.println("Insufficient cash!, withdrawal lower amount");
                    System.out.println();
                }
            }
            catch (Exception e){
                System.out.println("Error: invalid format");
                loop = false;
                //TODO kodsäkra
            }

        }
        while (loop);



    }

    static void exitApp() {

        System.exit(0);
    }
}
