import java.sql.*;
public class RegistrationDAO {
    public void registerStudentForCourse(int studentId, int courseId) {
        String sql = "INSERT INTO registrations (student_id, course_id) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, studentId);
            pstmt.setInt(2, courseId);
            pstmt.executeUpdate();
            System.out.println("Student successfully enrolled in the course!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listStudentCourses(int studentId) {
        String sql = "SELECT c.course_name, c.instructor FROM registrations r " +
                "JOIN courses c ON r.course_id = c.course_id " +
                "WHERE r.student_id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("\nCourses registered by Student ID " + studentId + ":");
            System.out.println("----------------------------");
            while (rs.next()) {
                System.out.println("Course: " + rs.getString("course_name") +
                        ", Instructor: " + rs.getString("instructor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
