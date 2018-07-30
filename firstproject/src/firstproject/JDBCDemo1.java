package firstproject;

import java.sql.*;

public class JDBCDemo1 {
	
	public static void main(String[] args) {
		// loading driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.out.println("Unable to locate the driver");
		}
		// connecting to server
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "scott";
		String password = "tiger";

		try {
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Connection successfull");
			// create statement object
			Statement stmt = con.createStatement();

			// execute SQL query

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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection not successfull");
			System.out.println(e.getMessage());
		}

	}

}
