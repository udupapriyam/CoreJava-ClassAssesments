package firstproject;

import java.io.*;
import java.sql.*;

public class BatchUpdateDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			String fname;
			double salary;
			String dept;
			
			String sql= "INSERT INTO employee VALUES(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "Riya");
			pstmt.setDouble(2, 25600.00);
			pstmt.setString(3, "Sales");
			pstmt.addBatch();
			
			pstmt.setString(1, "Isai");
			pstmt.setDouble(2, 54600.00);
			pstmt.setString(3, "IT");
			pstmt.addBatch();
			
			pstmt.setString(1, "Ram");
			pstmt.setDouble(2, 15600.00);
			pstmt.setString(3, "Marketing");
			pstmt.addBatch();
			
			pstmt.executeBatch();
			
//			int rowsAffected=pstmt.executeUpdate();
//			if(rowsAffected>0) {
//				System.out.println("Record inserted");
//			}
//			else {
//				System.out.println("Record not inserted");
//			}
		}
		catch(ClassNotFoundException ce) {
			System.out.println("Driver not found");

		}
		catch(SQLException e) {
			System.out.println("SQL exception occured");

		}
	}

}
