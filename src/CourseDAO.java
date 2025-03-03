import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAO {
    public void showAvailableCourses() {
        String sql = "SELECT * FROM courses";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("\nAvailable Courses:");
            System.out.println("----------------------------");
            while (rs.next()) {
                System.out.println("Course ID: " + rs.getInt("course_id") +
                        ", Name: " + rs.getString("course_name") +
                        ", Instructor: " + rs.getString("instructor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
