import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
    public void registerStudent(String name, String email) {
        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("Student registered successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showRegisteredStudents() {
        String sql = "SELECT * FROM students";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("\nRegistered Students:");
            System.out.println("----------------------------");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("student_id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
