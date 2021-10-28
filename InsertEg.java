package connectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertEg {

	public static void main(String[] args) {
		// insert data into tables of db
		try{Connection con=Eg2Connect.initializeDatabase();
		String sql="insert into customer(customer_name,town,grade)values(?,?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1,"MaungMaung");
		stmt.setString(2,"Pathein");
		stmt.setInt(3,45);
		stmt.executeUpdate();
		System.out.println("successfully Inserted");
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}

}
}