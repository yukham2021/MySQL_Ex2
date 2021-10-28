package connectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEg {

	public static void main(String[] args) {
		// delete data from table of db
		try {
			Connection con=Eg2Connect.initializeDatabase();
			String sql="delete from customer where customer_name=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,"MaungMaung");
			stmt.executeUpdate();
			System.out.println("Successfully Deleted");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
