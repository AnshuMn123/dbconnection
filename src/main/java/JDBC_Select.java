package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Select {
    public static void main ( String[] args ) throws Exception {
        Class.forName ( "com.mysql.cj.jdbc.Driver" );
        Connection con =  DriverManager.getConnection ( "jdbc:mysql://localhost:3306/Intro", "root", "Anshu@123" );

        PreparedStatement ps = con.prepareStatement ( "select * from stud" );
        ResultSet rs = ps.executeQuery ();

        while(rs.next ()){
            System.out.println (rs.getInt ( "id" ) + " " + rs.getString ( "name" ));
        }

        con.close ();
        ps.close ();

    }
}
