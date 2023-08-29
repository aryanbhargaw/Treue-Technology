
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ayan bhargaw
 */
public class javaconnect {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ayan bhargaw\\Documents\\NetBeansProjects\\Automated Car Parking System\\acps.sqlite");
             return conn;        
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
        
        }
    
    

