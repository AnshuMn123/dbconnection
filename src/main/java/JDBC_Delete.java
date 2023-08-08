package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Delete {
    public static void main ( String[] args ) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/Intro", "root", "Anshu@123");

        PreparedStatement ps = con.prepareStatement ( "delete from stud WHERE id = 1");

//        PreparedStatement ps = con.prepareStatement ( "ALTER TABLE stud ADD city1 VARCHAR(255)");

        int i = ps.executeUpdate ();
        if(i > 0){
            System.out.println ("delete successfully");
        }else{
            System.out.println ("deletion failed");
        }
        con.close ();
        ps.close ();
    }
}
