import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumber = 0; // Variable to store the sum

        // Loop to get 5 numbers from the user
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt(); // Read user input
            totalNumber += number; // Add to total
        }

        // Display the total
        System.out.println("\nTotal Number: " + totalNumber);

        scanner.close(); // Close the scanner
    }
}
