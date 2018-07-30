package firstproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class StatementMethodDemo2 {

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
			
			System.out.println("Enter firstname : ");
			fname=br.readLine();
			System.out.println("Enter salary : ");
			salary=Double.parseDouble(br.readLine());
			System.out.println("Enter department : ");
			dept=br.readLine();
			
			String sql= "INSERT INTO employee VALUES(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, fname);
			pstmt.setDouble(2, salary);
			pstmt.setString(3, dept);
			
			int rowsAffected=pstmt.executeUpdate();
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
		catch(IOException ie) {
			System.out.println("IO exception occured");

		}
		
	}

}
