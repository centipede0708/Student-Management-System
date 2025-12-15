import dao.StudentDao;
import model.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDao dao = new StudentDao();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Branch: ");
                    String branch = sc.nextLine();
                    System.out.print("Marks: ");
                    int marks = sc.nextInt();

                    dao.addStudent(new Student(name, email, branch, marks));
                }

                case 2 -> {
                    dao.getAllStudents().forEach(s ->
                            System.out.println(
                                    s.getId() + " | " +
                                    s.getName() + " | " +
                                    s.getBranch() + " | " +
                                    s.getMarks()
                            )
                    );
                }

                case 3 -> {
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Marks: ");
                    int marks = sc.nextInt();
                    dao.updateMarks(id, marks);
                }

                case 4 -> {
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    dao.deleteStudent(id);
                }

                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}
