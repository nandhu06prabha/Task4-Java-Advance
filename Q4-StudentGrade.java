package Basic;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    private final Map<String, Integer> studentMap;

    // Constructor to initialize the HashMap
    public StudentGrades() {
        studentMap = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentMap.containsKey(name)) {
            studentMap.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGradeByName(String name) {
        if (studentMap.containsKey(name)) {
            int grade = studentMap.get(name);
            System.out.println("Grade of student " + name + ": " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades studentGrades = new StudentGrades();

        // Menu-driven program to interact with the student grades
        while (true) {
            System.out.println("\n1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display grade by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String nameToAdd = scanner.nextLine();
                System.out.print("Enter grade: ");
                int gradeToAdd = scanner.nextInt();
                studentGrades.addStudent(nameToAdd, gradeToAdd);
            } else if (choice == 2) {
                System.out.print("Enter student name to remove: ");
                String nameToRemove = scanner.nextLine();
                studentGrades.removeStudent(nameToRemove);
            } else if (choice == 3) {
                System.out.print("Enter student name to display grade: ");
                String nameToDisplay = scanner.nextLine();
                studentGrades.displayGradeByName(nameToDisplay);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
