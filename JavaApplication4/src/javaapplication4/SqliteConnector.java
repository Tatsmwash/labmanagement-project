package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class SqliteConnector {
    
   Connection conn = null; 
    
    public static Connection ConnectorDB()
    {
        
   try{ 
 Class.forName("org.sqlite.JDBC");
Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tats\\Documents\\NetBeansProjects\\JavaApplication4\\labreserve.sqlite");
  JOptionPane.showMessageDialog(null,"Connected to Databases!!!");     
     return conn;    
            }catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null,e1);
                return null; 
            }
      
    }
}
    
    

