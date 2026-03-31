package studentManagementSystem;

import java.util.*;

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Delete 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, marks));
        System.out.println("Student Added!");
    }

    static void viewStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                s.display();
                return;
            }
        }
        System.out.println("Not Found");
    }

    static void deleteStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        students.removeIf(s -> s.id == id);
        System.out.println("Deleted if existed");
    }
}


