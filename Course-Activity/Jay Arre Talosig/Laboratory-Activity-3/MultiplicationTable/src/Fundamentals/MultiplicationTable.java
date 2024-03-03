package Fundamentals;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number of columns: ");
            int columns = scanner.nextInt();

            System.out.print("Input number of rows: ");
            int rows = scanner.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    int result = i * j;
                    System.out.format("%4d", result);
                }
                System.out.println();
            }
        }
    }
}