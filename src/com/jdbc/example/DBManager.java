package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/cruddb";
	private String uid = "root";
	private String password = "";
	
	public void selectRecords() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uid, password);
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from student");
			
			while(result.next()) {
				System.out.println("STUDENT_NO= "+result.getInt(1));
				System.out.println("STUDENT_NAME= "+result.getString(2));
				System.out.println("STUDENT_DOB= "+result.getDate(3));
				System.out.println("STUDENT_DOJ= "+result.getDate(4));
				System.out.println("======================");
			}
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public boolean RecordsManipulation(String query) {
		boolean flag = false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uid, password);
			Statement stmt = con.createStatement();
			flag = stmt.executeUpdate(query) > 0 ? true: false;
			con.close();
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		return flag;
	}
}
