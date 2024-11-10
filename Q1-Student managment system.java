package Basic;

import java.util.Scanner;

// AgeNotWithinRangeException class
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// NameNotValidException class
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private final int rollNo;
    private final String name;
    private final int age;
    private final String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }

        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to validate name
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Override toString method for better printing
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

// Main class to demonstrate exception handling
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get student details from user
            System.out.println("Enter student details:");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Course: ");
            String course = scanner.nextLine();

            // Create student object
            Student student = new Student(rollNo, name, age, course);
            System.out.println("Student details: " + student);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
