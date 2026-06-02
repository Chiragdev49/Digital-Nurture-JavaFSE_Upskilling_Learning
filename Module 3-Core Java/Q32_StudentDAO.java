import java.sql.*;

public class Q32_StudentDAO {

    private static final String URL =
            "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void insertStudent(int id, String name, int age) {

        String sql =
                "INSERT INTO students(id, name, age) VALUES (?, ?, ?)";

        try (Connection con =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            ps.executeUpdate();
            System.out.println("Student inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name) {

        String sql =
                "UPDATE students SET name=? WHERE id=?";

        try (Connection con =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Student updated successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Q32_StudentDAO dao = new Q32_StudentDAO();

        dao.insertStudent(1, "Chirag", 20);
        dao.updateStudent(1, "Chirag Dev");
    }
}
