import java.util.ArrayList;
import java.util.Scanner;

class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> expenses = new ArrayList<>();

        while (true) {
            System.out.println("Expense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense amount: $");
                    double amount = scanner.nextDouble();
                    expenses.add(amount);
                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    System.out.println("Expenses:");
                    for (int i = 0; i < expenses.size(); i++) {
                        System.out.println((i + 1) + ". $" + expenses.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}