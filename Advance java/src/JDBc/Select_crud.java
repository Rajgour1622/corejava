package JDBc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_crud {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("Select * From maintable");
		System.out.println("ID\tname\tcolor");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println("\t"+rs.getString(2));
			System.out.println("\t"+rs.getString(3));
			
		}

		stmt.close();
		conn.close();
	}

}
