import java.util.Scanner;

// InvalidAgeException class (custom checked exception)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Voter class
class Voter {
    private final String voterId;
    private final String name;
    private final int age;

    // Parameterized constructor
    public Voter(String voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter.");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override toString method for better printing
    @Override
    public String toString() {
        return "Voter{" +
                "voterId='" + voterId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Main class to demonstrate exception handling
public class VoterTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get voter details from user
            System.out.println("Enter voter details:");
            System.out.print("Voter ID: ");
            String voterId = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();

            // Create voter object
            Voter voter = new Voter(voterId, name, age);
            System.out.println("Voter details: " + voter);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
