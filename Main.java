import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter PRN: ");
            long prn = sc.nextLong();
            System.out.println("Enter CGPA: ");
            double cgpa = sc.nextDouble();
            System.out.println("Enter Branch: ");
            String branch = sc.next();

            StudentOperations operations = new StudentOperations();
            Student student = new Student(name, prn, cgpa, branch);
            operations.addStudents(student);
            operations.displayStudents();

            sc.close();
        }
    }
}