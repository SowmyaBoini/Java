import java.util.Scanner;

public class StudentIDCard {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for and store student's name
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        // Ask for and store student's age
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Ask for and store student's blood group
        System.out.print("Enter your Blood Group: ");
        String bloodGroup = scanner.nextLine();

        // Determine the group based on the age
        String group;
        if (age >= 20) {
            group = "RED";
        } else if (age >= 15) {
            group = "BLUE";
        } else if (age >= 10) {
            group = "YELLOW";
        } else {
            group = "No group"; // Assuming students younger than 10 don't have a group
        }

        // Print the student ID card
        System.out.println("----------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("----------------------------");
        System.out.println("Your group is " + group);
        System.out.println("----------------------------");

        // Close the scanner
        scanner.close();
    }
}
