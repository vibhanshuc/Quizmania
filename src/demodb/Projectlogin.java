/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demodb;

/**
 *
 * @author player
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package 
/**
 *
 * @author player
 */
import java.sql.*;
import javax.swing.*;

 class connection {
    Connection conn =null;
    public static Connection connecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:test1.sqlite");          
            //JOptionPane.showMessageDialog(null,"Connection Established");
            return conn;
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}


