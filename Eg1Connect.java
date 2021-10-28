package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Eg1Connect {

	public static void main(String[] args) {
		//connect java with MySQL Database
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise","root","root");
				System.out.println("Connected Successfully");	
				
				} catch (Exception e) {
					
					e.printStackTrace();
				}
	}

}
