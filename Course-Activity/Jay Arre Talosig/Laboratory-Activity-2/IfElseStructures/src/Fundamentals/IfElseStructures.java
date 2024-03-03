package Fundamentals;
import java.util.Scanner;

public class IfElseStructures {
    public static void main(String[] args) {
        int grade;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student Final Grade: ");
        grade = sc.nextInt();
        
        String equivalent = "";
        String remarks = "";
        
        if (grade >= 98 && grade <= 100) {
            equivalent = "A+";
        } else if (grade >= 95 && grade <= 97) {
            equivalent = "A";
        } else if (grade >= 92 && grade <= 94) {
            equivalent = "A-";
        } else if (grade >= 89 && grade <= 91) {
            equivalent = "B+";
        } else if (grade >= 86 && grade <= 88) {
            equivalent = "B";
        } else if (grade >= 83 && grade <= 85) {
            equivalent = "B-";
        } else if (grade >= 80 && grade <= 82) {
            equivalent = "C+";
        } else if (grade >= 77 && grade <= 79) {
            equivalent = "C";
        } else if (grade >= 75 && grade <= 76) {
            equivalent = "C-";
        } else {
            equivalent = "F";
        }
        
        remarks = (equivalent.equals("F")) ? "FAILED" : "PASSED";
        
        System.out.println("Equivalent: " + equivalent);
        System.out.println("Remarks: " + remarks);
        
        sc.close();
    }
}