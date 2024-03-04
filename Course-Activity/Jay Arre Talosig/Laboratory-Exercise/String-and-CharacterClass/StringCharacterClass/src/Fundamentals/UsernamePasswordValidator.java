package Fundamentals;

import java.awt.Toolkit;
import java.util.Scanner;

public class UsernamePasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctUsername = "fundamentals";
        String correctPassword = "admin";
        int maxTrials = 3;
        int trialCount = 0;

        for (int x = 0; x < maxTrials; x++) {

            System.out.print("Username: ");
            String username = scanner.nextLine().toUpperCase();

            System.out.print("Password: ");
            String password = scanner.nextLine().toLowerCase();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break;
            } else {
                System.out.println("Invalid username or password. Please try again.");
                trialCount++;

                if (trialCount == maxTrials) {
                    System.out.println("You have entered incorrect password 3 times. Your account is locked.");
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        scanner.close();
    }
}