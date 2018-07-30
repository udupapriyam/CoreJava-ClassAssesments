package firstproject;

import java.sql.*;

public class CallableStatementDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);

			String sql = "{?=call big1(?,?) }";
			CallableStatement cstmt = con.prepareCall(sql);

			// Register the data type for output parameters
			cstmt.registerOutParameter(1, Types.INTEGER);

			// Provide the IN parameter
			cstmt.setInt(2, 25);
			cstmt.setInt(3, 125);

			// Execute the SQL function
			cstmt.execute();
			System.out.println("SQL function executed successfully");
			System.out.println("Biggest number is " + cstmt.getInt(1));

		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}

	}

}
