package connectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Retrive {

	public static void main(String[] args) {
		// Retrieve from exercise database
		try{Connection con=Eg2Connect.initializeDatabase();
		String sql="select * from customer";
		
			PreparedStatement stmt=con.prepareStatement(sql);
		ResultSet rs=stmt.executeQuery();
		while (rs.next()) {
			int id=rs.getInt("customer_id");
			String name=rs.getString("customer_name");
			String town=rs.getString("town");
			System.out.println("ID:"+id+"Name:"+name+"Town:"+town);
				
					
		}
		} catch(Exception e){
			e.printStackTrace();
		}
		}

	}


