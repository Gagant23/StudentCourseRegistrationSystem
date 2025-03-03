import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        RegistrationDAO registrationDAO = new RegistrationDAO();

        while (true) {
            System.out.println("\n==== Student Course Registration System ====");
            System.out.println("1. Register Student");
            System.out.println("2. Show Registered Students");
            System.out.println("3. Show Available Courses");
            System.out.println("4. Register Student for Course");
            System.out.println("5. View Registered Courses");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Email: ");
                    String email = scanner.nextLine();
                    studentDAO.registerStudent(name, email);
                    break;
                case 2:
                    studentDAO.showRegisteredStudents();
                    break;
                case 3:
                    courseDAO.showAvailableCourses();
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    registrationDAO.registerStudentForCourse(studentId, courseId);
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    int sid = scanner.nextInt();
                    registrationDAO.listStudentCourses(sid);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
