package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Update {
    public static void main ( String[] args ) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/Intro", "root", "Anshu@123");

//        PreparedStatement ps = con.prepareStatement ( "insert into stud value(122,'a')" );

        PreparedStatement ps = con.prepareStatement ( "update stud set city = 'vd' where id = 12");

//        PreparedStatement ps = con.prepareStatement ( "ALTER TABLE stud ADD city1 VARCHAR(255)");


        int i = ps.executeUpdate ();
        if(i > 0){
            System.out.println ("updated successfully");
        }else{
            System.out.println ("updation failed");
        }
        con.close ();
        ps.close ();
    }
}
