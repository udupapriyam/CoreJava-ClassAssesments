package firstproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class DailyStepsProgram1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			Statement stmt=con.createStatement();
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter name : ");
			String fname=br.readLine();
			System.out.println("Enter date : ");
			Date date1=Date.valueOf(br.readLine());
			System.out.println("Enter steps : ");
			int step=Integer.parseInt(br.readLine());
			
			String sql= "INSERT INTO employee VALUES(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, fname);
			pstmt.setDate(2, date1);
			pstmt.setInt(3, step);
			
			int i=pstmt.executeUpdate();
			if(i>0) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("Record not inserted");
			}
			
			System.out.println("Enter name : ");
			String cname=br.readLine();
			System.out.println("Enter steps : ");
			int stepz=Integer.parseInt(br.readLine());
			
			String sql2="UPDATE totalsteps SET steps=steps+'"+stepz+"' WHERE trim(pname)='"+cname+"'";
			int j=stmt.executeUpdate(sql2);
			if(j>0) {
				System.out.println("Record updated");
			}
			else {
				System.out.println("Record not updated");
			}
			
			if(i>0 && j>0) {
				con.commit();
				System.out.println("Committing..");
			}
			else {
				con.rollback();
				System.out.println("Rolling back..");
			}
			
		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} 
		catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
