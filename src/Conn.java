
import java.sql.*;

public class Conn{
	    
	public Connection c;
	public Statement s;
	 
	public Conn(){
	       try{
	          Class.forName("com.mysql.jdbc.Driver");
              c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project61","root","");
	          s = c.createStatement();
	        }
	       catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	 


