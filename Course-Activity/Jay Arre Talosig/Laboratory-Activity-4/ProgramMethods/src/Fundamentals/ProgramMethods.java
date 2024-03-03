package Fundamentals;
import java.util.Scanner;

public class ProgramMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("**********Program Methods***************");
            System.out.println("[A] Display Method A");
            System.out.println("[B] Display Method B");
            System.out.println("[C] Display Method C");
            System.out.println("[X] Program Exit");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextLine();

            switch (choice.toUpperCase()) {
                case "A":
                    displayMethodA();
                    break;
                case "B":
                    displayMethodB();
                    break;
                case "C":
                    displayMethodC();
                    break;
                case "X":
                    System.out.println("Thank You For Using the Program Methods");
                    System.out.println("Program Terminated Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.println("Please Try Again....");
                    break;
            }

            System.out.println();
        } while (!choice.equalsIgnoreCase("X"));

        scanner.close();
    }

    public static void displayMethodA() {
        System.out.println("Method Output A");

        for (int x = 0; x < 5; x++) {
            for (int y = 9; y > 0; y--) {
                System.out.print(y + ", ");
            }
            System.out.println("0,");
        }
    }

    public static void displayMethodB() {
        System.out.println("Method Output B");

        for (int i = 5; i >= 1; i--) {
            System.out.print(i);
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void displayMethodC() {
        System.out.println("Method Output C");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * ");
            }
            System.out.println();
        }
    }
}