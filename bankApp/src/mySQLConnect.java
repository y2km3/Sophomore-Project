/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousif
 */
import java.sql.*;
import javax.swing.*;

public class mySQLConnect extends bankLogin{
    Connection conn = null;
    String id;
    
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://Yousifs-MacBook-Pro-4.local:3306/Bank?zeroDateTimeBehavior=convertToNull","root","quantum");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
