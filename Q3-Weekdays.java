import java.util.Scanner;

public class WeekdayArray {
    public static void main(String[] args) {
        // Array to store names of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a scanner object to get user input

        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the day position
            System.out.print("Enter the day position (0-6): ");
            int dayIndex = scanner.nextInt();

            // Check if the day index is within the valid range
            if (dayIndex >= 0 && dayIndex < weekdays.length) {
                // Print the name of the day
                System.out.println("Day name: " + weekdays[dayIndex]);
            } else {
                // If the day index is outside the valid range, throw an exception
                throw new ArrayIndexOutOfBoundsException("Day index is outside the valid range (0-6).");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch and handle the ArrayIndexOutOfBoundsException
            System.out.println("Exception caught: " + e.getMessage());
        }
        // Close the scanner
    }
}
