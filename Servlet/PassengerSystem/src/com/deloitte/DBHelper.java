package com.deloitte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBHelper {
	public ArrayList getALLPassenger(String destination) {
		ArrayList al = new ArrayList();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM passengers WHERE trim(destination)=?");
			pstmt.setString(1, destination);
			ResultSet rs = pstmt.executeQuery();

			// convert result set into array list
			while (rs.next()) {
				String fname = rs.getString(1);
				String lname = rs.getString(2);
				String source = rs.getString(3);
				String dest = rs.getString(4);
				String gender = rs.getString(5);

				PassengerVO pvo = new PassengerVO();
				pvo.setFname(fname);
				pvo.setLname(lname);
				pvo.setSource(source);
				pvo.setDestination(destination);
				pvo.setGender(gender);

				al.add(pvo);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return al;
	}
}
