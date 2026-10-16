import java.util.Scanner;
public class task6 {}
    public static void main(String[] args) {
        Scanner vision = new Scanner(System.in);
        System.out.println("task 6.");
        System.out.println("Enter next information about yourself: ");
        System.out.println("Age: ");
        int ageApp = vision.nextInt();
        System.out.println("Monthly income: ");
        int incApp = vision.nextInt();
        System.out.println("Credit score (0-100): ");
        int credApp = vision.nextInt();
        System.out.println("Number of years at current job: ");
        int jobApp = vision.nextInt();
        String skip = vision.nextLine();
        System.out.println("Do you have any existing debt? (true/false): ");
        boolean debtApp = vision.nextBoolean();
        if (ageApp >= 21 && ageApp <= 65 && incApp >= 30000 && credApp >= 70) {
            if (jobApp >= 2 || !debtApp) {
                System.out.println("Age requirement: ");
                System.out.println("Income requirement: ");
                System.out.println("Credit score requirement: ");
                System.out.println("Result: Loan Approved ");
            } else {
                System.out.println("Your must have worked at least 2 years at current job OR have no debts. ");
                System.out.println("Result: Loan Rejected ❌");
            }
        } else {
            if (ageApp <= 21 || ageApp >= 65) {
                System.out.println("Age requirement: ");
            } else {
                System.out.println("Age requirement: ");
            }
            if (incApp < 30000) {
                System.out.println("Income requirement: ");
            } else {
                System.out.println("Income requirement: ");
            }
            if (credApp < 70) {
                System.out.println("Credit score requirement: ");
            } else {
                System.out.println("Credit score requirement: ");
            }
            System.out.println("Result: Loan Rejected ");
        }
    }
