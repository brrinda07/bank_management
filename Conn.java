package bank.management.system;

/*Register the drive
 *Create Connection
 *Create Statement
 * Execute Query
*/

import java.sql.*;


public class Conn{
    
    Connection c;
    Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem1","root","madhu@2001");
            s = c.createStatement();  
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


