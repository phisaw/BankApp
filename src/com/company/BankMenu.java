package com.company;
import java.util.Scanner;

public class BankMenu {

    Scanner Scan = new Scanner(System.in);

    public void switchCase() {
        String choice;
        do {
            System.out.println();
            System.out.println("Enter choice (1 - 4)");
            System.out.println();
            System.out.println("1. View Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdrawal Cash");
            System.out.println("4. Exit Application");
            System.out.print(">");

            choice = Scan.nextLine();


            switch (choice) {
                case "1":
                    BankFeatures.viewBalance();
                    break;

                case "2":
                    BankFeatures.depositCash();
                    break;

                case "3":
                    BankFeatures.withdrawalCash();

                case "4":
                    BankFeatures.exitApp();
                    break;

                default:
                    System.out.println("Invalid choice, enter 1-4");
                    break;
            }
        }
        while (choice.equals("1") || choice.equals("2") || choice.equals("3"));
        //TODO fixa while loop med alternativ 3.
    }
}
