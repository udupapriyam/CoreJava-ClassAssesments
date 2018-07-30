package firstproject;

import java.sql.*;

public class DailyStepsProgram {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO dailysteps VALUES('Peter','25-JUL-2018',500)";
			int i=stmt.executeUpdate(sql);
			if(i>0) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("Record not inserted");
			}
			
			String sql2="UPDATE totalsteps SET steps=steps+1000 WHERE trim(pname)='Peter'";
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
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
