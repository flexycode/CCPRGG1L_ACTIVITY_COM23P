package Fundamentals;

import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input section
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Department: ");
        String empDept = scanner.nextLine();

        System.out.print("Rate per Hour: ");
        double ratePerHour = scanner.nextDouble();

        System.out.print("No. of Hours Worked: ");
        double noHrsWorked = scanner.nextDouble();
        
        // Calculation section
        double grossPay = ratePerHour * noHrsWorked;
        double sss = grossPay * 0.05;
        double wTax = grossPay * 0.1;
        double pagIbig = 100;
        double philHealth = 150;
        double deduction = sss + wTax + pagIbig + philHealth;
        double netSalary = grossPay - deduction;
        
        // Output Section
        System.out.println("\nEmployee Salary Information");
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + empDept);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("No. of Hours Worked: " + noHrsWorked);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("SSS: " + sss);
        System.out.println("W/Tax: " + wTax);
        System.out.println("Pag-Ibig: " + pagIbig);
        System.out.println("PH: " + philHealth);
        System.out.println("\nEmployee Net Salary: " + netSalary);

        scanner.close();
        
    }
}