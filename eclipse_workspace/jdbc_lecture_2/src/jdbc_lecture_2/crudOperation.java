
package jdbc_lecture_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class crudOperation {

    public static void main(String[] args) {

        try {

            // CONNECT
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testDB1",
                    "root",
                    "1999"
            );

            System.out.println("Database Connected");

            Statement stmnt = con.createStatement();

            // =========================
            // CREATE / INSERT
            // =========================

            String insertQuery =
                    "INSERT INTO newregistration " +
                    "(student_id, first_name, last_name, email, mobile) " +
                    "VALUES " +
                    "(1, 'Rahul', 'Sharma', 'rahul.sharma@gmail.com', '9876543210')";

            int insertRows = stmnt.executeUpdate(insertQuery);

            System.out.println(insertRows + " Row Inserted");

            // =========================
            // READ / SELECT
            // =========================

            String selectQuery = "SELECT * FROM newregistration";

            ResultSet rs = stmnt.executeQuery(selectQuery);

            System.out.println("\nStudent Records:");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("student_id") + " | " +
                        rs.getString("first_name") + " | " +
                        rs.getString("last_name") + " | " +
                        rs.getString("email") + " | " +
                        rs.getString("mobile")
                );
            }

            // =========================
            // UPDATE
            // =========================

            String updateQuery =
                    "UPDATE newregistration " +
                    "SET email='rahul.new@gmail.com' " +
                    "WHERE student_id=1";

            int updateRows = stmnt.executeUpdate(updateQuery);

            System.out.println("\n" + updateRows + " Row Updated");

            // =========================
            // DELETE
            // =========================

            String deleteQuery =
                    "DELETE FROM newregistration WHERE student_id=1";

            int deleteRows = stmnt.executeUpdate(deleteQuery);

            System.out.println(deleteRows + " Row Deleted");

            // CLOSE CONNECTION
            con.close();

            System.out.println("\nConnection Closed");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}

