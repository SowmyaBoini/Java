import java.util.Scanner;

public class TaxCalculatorApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Tax Calculator App");
        System.out.println("----- WELCOME ------");

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for total number of persons
        System.out.print("Enter total person count: ");
        int personCount = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Create arrays to store names and incomes
        String[] names = new String[personCount];
        long[] incomes = new long[personCount];

        // Get names and incomes from user input
        for (int i = 0; i < personCount; i++) {
            System.out.print("Enter name " + (i + 1) + " : ");
            names[i] = scanner.nextLine();
            System.out.print("Enter " + names[i] + "'s Annual Income: ");
            incomes[i] = scanner.nextLong();
            scanner.nextLine(); // consume the newline character
        }

        // Print header for liable taxes
        System.out.println("Names with liable taxes");
        System.out.println("----------------------------");

        // Calculate and print tax for each person
        for (int i = 0; i < personCount; i++) {
            calculateTax(names[i], incomes[i]);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate and print tax
    public static void calculateTax(String name, long income) {
        long tax;
        if (income >= 300000) {
            tax = income * 20 / 100;
        } else if (income >= 100000) {
            tax = income * 10 / 100;
        } else {
            tax = 0;
        }
        System.out.println(name + " : ₹" + tax);
    }
}

