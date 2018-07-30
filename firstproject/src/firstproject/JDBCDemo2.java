package firstproject;

import java.sql.*;

public class JDBCDemo2 {

	public static Connection giveConnection() throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// connecting to server
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Connection successfull");
			// create statement object
			Statement stmt = con.createStatement();
			return con;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection not successfull");
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static String executeQuery() {
		ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
		
		while (rs.next()) {
			String fname = rs.getString(1);
			int salary = rs.getInt(2);
			String dept = rs.getString(3);
			System.out.println(fname + " " + salary + " " + dept);
		}
		
		rs.close();
		con.close();
		stmt.close();
		System.out.println("Connection not successfull");
		System.out.println(e.getMessage());
	}

	public static void main(String[] args) {

	}

}
