import java.util.Scanner;

public class StudentResultCalculator {

    public static void main(String[] args) {

        // JVM starts execution from here

        Scanner sc = new Scanner(System.in);

        // Data types
        String studentName;
        int mark1, mark2, mark3;
        int total;
        double average;
        char grade;

        System.out.println("===== Student Result Calculator =====");

        // Input
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Marks for Subject 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Marks for Subject 3: ");
        mark3 = sc.nextInt();

        // Calculation
        total = mark1 + mark2 + mark3;
        average = total / 3.0;

        // Grade calculation using if-else
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output
        System.out.println("\n===== Result =====");
        System.out.println("Student Name:   " + studentName);
        System.out.println("Total Marks:    " + total);
        System.out.println("Average:        " + average);
        System.out.println("Grade:          " + grade);

        // Pass/Fail Check
        if (average >= 40) {
            System.out.println("Status:         PASS");
        } else {
            System.out.println("Status:         FAIL");
        }

        sc.close();
    }
}