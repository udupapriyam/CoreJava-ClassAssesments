package firstproject;


import java.io.*;
import java.sql.*;

public class ResultSetReverseDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs= stmt.executeQuery("SELECT * FROM employee");
			ResultSetMetaData md=rs.getMetaData();
			rs.absolute(3);
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getString("name")+rs.getDouble("salary")+rs.getString("depatment"));
			}
			System.out.println("Result Set has "+md.getColumnCount());
			System.out.println("The column type of 1st column is "+md.getColumnType(1));
			
			DatabaseMetaData dmd=con.getMetaData();
			System.out.println("data base product name is "+dmd.getDatabaseProductName());
			
			rs.close();
			stmt.close();
			con.close();
		}
		catch(ClassNotFoundException ce) {
			System.out.println("Driver not found");

		}
		catch(SQLException e) {
			System.out.println("SQL exception occured"+e.getMessage());

		}
	}

}
