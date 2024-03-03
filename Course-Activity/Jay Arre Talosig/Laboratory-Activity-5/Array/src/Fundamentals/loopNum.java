package Fundamentals;
import java.util.Scanner;

public class loopNum {
    public static void main(String[] args) {
        int counter = 0;
        int[] num = new int[10];
        try (Scanner scn = new Scanner(System.in)) {
			for (counter = 0; counter < 10; counter++) {
			    System.out.print("Enter a number " + (counter + 1) + ": ");
			    num[counter] = scn.nextInt();
			}

			int maxNumber = num[0];
			int minNumber = num[0];

			for (int i = 1; i < 10; i++) {
			    if (num[i] > maxNumber) {
			        maxNumber = num[i];
			    }
			    if (num[i] < minNumber) {
			        minNumber = num[i];
			    }
			}

			System.out.println("The number with the greatest value is " + maxNumber);
			System.out.println("The number with the least value is " + minNumber);

			scn.close();
		}
    }
}