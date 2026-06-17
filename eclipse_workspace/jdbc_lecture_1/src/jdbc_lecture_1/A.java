package jdbc_lecture_1;

import java.sql.Connection;
import java.sql.DriverManager;

public class A {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testDB1",
                    "root",
                    "1999"
            );

            System.out.println("Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}