import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class StudentDatabase {
    public static void createDBndTable(){
        Connection connection = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            st = connection.createStatement();
            String createDatabase = "CREATE DATABASE IF NOT EXISTS student_db";
            st.executeUpdate(createDatabase);
            st.close();
            connection.close();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            st=connection.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS student ("
                    + "`Reg No` VARCHAR(50), "
                    + "`Full Name` VARCHAR(20), "
                    + "Maths_mark INT, "
                    + "Chemistry_mark INT, "
                    + "Physics_mark INT, "
                    + "CS_mark INT)";
            st.executeUpdate(createTable);
            System.out.println("Database and table created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertField(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            String insertSQL = "INSERT INTO student (`Reg No`, `Full Name`, Maths_mark, Chemistry_mark, Physics_mark, CS_mark) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(insertSQL);
            ps.setString(1, "2021001");
            ps.setString(2, "Brindha");
            ps.setInt(3, 90);
            ps.setInt(4, 88);
            ps.setInt(5, 90);
            ps.setInt(6, 99);
            ps.executeUpdate();
            ps.setString(1, "2021002");
            ps.setString(2, "Joo");
            ps.setInt(3, 95);
            ps.setInt(4, 89);
            ps.setInt(5, 90);
            ps.setInt(6, 95);
            ps.executeUpdate();
            ps.setString(1, "2021003");
            ps.setString(2, "Karthii");
            ps.setInt(3, 93);
            ps.setInt(4, 85);
            ps.setInt(5, 94);
            ps.setInt(6, 98);
            ps.executeUpdate();
            System.out.println("Records inserted successfully!");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (connection != null) connection.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }

    public static void selectField(){
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            st = connection.createStatement();
            String sql = "SELECT * FROM student";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("Reg No") + " | "
                        + rs.getString("Full Name") + " | "
                        + rs.getInt("Maths_mark") + " | "
                        + rs.getInt("Chemistry_mark") + " | "
                        + rs.getInt("Physics_mark") + " | "
                        + rs.getInt("CS_mark"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        createDBndTable();
        insertField();
        selectField();
    }
}
