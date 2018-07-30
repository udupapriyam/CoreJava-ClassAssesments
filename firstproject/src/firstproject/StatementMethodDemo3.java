package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatementMethodDemo3 {

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
			
			System.out.println("Enter firstname of employee to be deleted : ");
			fname=br.readLine();
			
			String sql= "DELETE FROM employee WHERE TRIM(name)=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, fname);
			
			int rowsAffected=pstmt.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("Record Deleted");
			}
			else {
				System.out.println("Record not deleted");
			}
		}
		catch(ClassNotFoundException ce) {
			System.out.println("Driver not found");

		}
		catch(SQLException e) {
			System.out.println("SQL exception occured");

		}
		catch(IOException ie) {
			System.out.println("IO exception occured");

		}
	}

}
