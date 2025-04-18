import java.util.*;

class StudentOperations {
    ArrayList<Student> students;

    public StudentOperations() {
        students = new ArrayList<Student>();
    }

    public void addStudents(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }
}