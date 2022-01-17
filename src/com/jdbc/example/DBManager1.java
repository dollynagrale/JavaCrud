package com.jdbc.example;

import java.sql.Date;
	
public class DBManager1 {
	
	private DBManager db;
	
	public DBManager1() {
		db = new DBManager();
	}
	
	public void selectData(){
		db.selectRecords();
	}
	public void insertData(int STUDENT_NO, String STUDENT_NAME, Date STUDENT_DOB, Date STUDENT_DOJ) {
		String cmd = "insert into student(STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ) values('"+STUDENT_NO+"','"+STUDENT_NAME+"','"+STUDENT_DOB+"','"+STUDENT_DOJ+"')";
		
		
		if(db.RecordsManipulation(cmd)) {
			System.out.println("Record has been saved successfully");
		}else {	
			System.out.println("Record has not been saved successfully");
		}	
	}
	
	public void updateData(int STUDENT_NO, String STUDENT_NAME) {
		String cmd = "update  student set STUDENT_NAME='"+STUDENT_NAME+"'where STUDENT_NO='"+STUDENT_NO+"'";
		
		
		if(db.RecordsManipulation(cmd)) {
			System.out.println("Record has been updated successfully");
		}else {	
			System.out.println("Record has not been updated successfully");
		}	
	}
	
	public void deleteData(int STUDENT_NO) {
		String cmd = "delete  from student where STUDENT_NO='"+STUDENT_NO+"'";
		
		
		if(db.RecordsManipulation(cmd)) {
			System.out.println("Record has been deleted successfully");
		}else {	
			System.out.println("Record has not been deleted successfully");
		}	
	}
	
	
}
