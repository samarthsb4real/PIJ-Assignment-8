import exceptions.InvalidBranchException;
import exceptions.InvalidCGPAException;
import exceptions.InvalidNameException;
import exceptions.InvalidPRNException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            StudentOperations operations = new StudentOperations();
            
            for (int i = 0; i < n; i++) {
                boolean validInput = false;
                
                while (!validInput) {
                    try {
                        System.out.println("\nEntering details for Student " + (i+1) + ":");
                        System.out.println("Enter Name: ");
                        String name = sc.nextLine();
                        
                        System.out.println("Enter PRN (must be 11 digits): ");
                        long prn = sc.nextLong();
                        sc.nextLine(); // Consume newline
                        
                        System.out.println("Enter CGPA (0-10): ");
                        double cgpa = sc.nextDouble();
                        sc.nextLine(); // Consume newline
                        
                        System.out.println("Enter Branch (CSE, AIML, ENTC, MECH, CIVIL): ");
                        String branch = sc.nextLine();
                        
                        Student student = new Student(name, prn, cgpa, branch);
                        operations.addStudents(student);
                        System.out.println("Student added successfully!");
                        validInput = true;
                    } catch (InvalidNameException e) {
                        System.out.println("Invalid name: " + e.getMessage());
                    } catch (InvalidPRNException e) {
                        System.out.println("Invalid PRN: " + e.getMessage());
                        sc.nextLine(); // Clear input buffer if nextLong failed
                    } catch (InvalidCGPAException e) {
                        System.out.println("Invalid CGPA: " + e.getMessage());
                        sc.nextLine(); // Clear input buffer if nextDouble failed
                    } catch (InvalidBranchException e) {
                        System.out.println("Invalid branch: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                        sc.nextLine(); // Clear input buffer
                    }
                }
            }
            
            // Display all students after collecting input
            System.out.println("\nAll Students:");
            operations.displayStudents();
        }
    }
}