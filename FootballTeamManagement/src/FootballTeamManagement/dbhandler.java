/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballTeamManagement;

import java.sql.*;

/**
 *
 * @author jayakrishnan
 */
public class dbhandler {
    
 Connection conn;
  Statement st; 
    public dbhandler(){
         try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
             conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott",
					"password");
             st=conn.createStatement();
   
        }
        catch(ClassNotFoundException | SQLException e)
        {
             System.out.println(e);
        }
       }
    
    
  
}
