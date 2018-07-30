package firstproject;

import java.sql.*;

public class StatementMethodDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			Statement stmt = con.createStatement();
			String fname="Allan";
			double salary=25000.00;
			String dept="Bowling";
			String doj="30-JUL-2018";
			//Date doj1=Date.valueOf(doj);
			int rowsAffected= stmt.executeUpdate("INSERT INTO employee VALUES('Allan',25000.00,'Bowling')");
			if(rowsAffected>0) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("Record not inserted");
			}
		}
		catch(ClassNotFoundException ce) {
			System.out.println("Driver not found");

		}
		catch(SQLException e) {
			System.out.println("SQL exception occured");

		}
		
	}

}
