package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_demo {
    public static void main ( String[] args ) throws Exception {
        int id = 12;
        String name = "12";

        Class.forName ( "com.mysql.cj.jdbc.Driver" ); // 1. Load and register drivers
        Connection con = DriverManager.getConnection ( "jdbc:mysql://localhost:3306/Intro", "root", "Anshu@123" ); // 2. Create a connection


//        PreparedStatement ps = con.prepareStatement ( "insert into stud values(6, 'a')" );
        //                  or
//        PreparedStatement ps = con.prepareStatement ( "insert into stud values("+id+", "+name+")" ); // 3. Create statement

        //                  or
        PreparedStatement ps = con.prepareStatement ( "insert into stud values(?, ?)"); // knows as positional parameter
        ps.setInt ( 1, id );
        ps.setString ( 2, name );

        int i = ps.executeUpdate (); // 4. Execute SQL statement
        if (i > 0) {
            System.out.println ( "pass" );
        } else {
            System.out.println ( "fail" );
        }
        ps.close (); // Close the connection
        con.close ();
    }
}