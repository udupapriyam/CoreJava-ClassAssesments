package com.deloitte;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//my method
	public void insertRow(Employee emp) {
		int eid=emp.getEmployeeId();
		String ename=emp.getEmployeeName();
		int did=emp.getDepartmentId();
		
		String sql="INSERT INTO employee1 VALUES("+eid+",'"+ename+"',"+did+")";
		int rows=jdbcTemplate.update(sql);
		if(rows>0) {
			System.out.println("Successfully inserted");
		}
		else {
			System.out.println("Not inserted");
		}
	}
	public void deleteRow(Employee emp) {
		String ename=emp.getEmployeeName();
		String sql="DELETE FROM employee1 WHERE empname='"+ename+"'";
		jdbcTemplate.execute(sql);
		System.out.println("Deleted successfully");
	}
	
	public void insertMultipleRow(Employee[] emp) {
		for(int i=0; i<emp.length; i++) {
			int eid=emp[i].getEmployeeId();
			String ename=emp[i].getEmployeeName();
			int did=emp[i].getDepartmentId();
			
			String sql="INSERT INTO employee1 VALUES("+eid+",'"+ename+"',"+did+")";
			int rows=jdbcTemplate.update(sql);
			if(rows>0) {
				System.out.println("1 row inserted");
			}
			else {
				System.out.println("Not inserted");
			}
		}
		
	}
	
	public void updateRow(Employee emp) {
		String ename=emp.getEmployeeName();
		int id=113;
		String sql="UPDATE employee1 SET deptid="+id+" WHERE empname='"+ename+"'";
		int rows=jdbcTemplate.update(String.format(sql));
		if(rows>0) {
			System.out.println("1 row updated");
		}
		else {
			System.out.println("Not updated");
		}
	}
	
	public List<Employee> readAll() {
		List<Employee>allEmployees;
		
		String sql="SELECT * FROM employee1";
		allEmployees=jdbcTemplate.query(sql, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				int eid=rs.getInt(1);
				String ename=rs.getString(2);
				int did=rs.getInt(3);
				Employee e=new Employee();
				e.setEmployeeId(eid);
				e.setEmployeeName(ename);
				e.setDepartmentId(did);
				return e;
			}
		});
		return allEmployees;
		
	}
	
}
