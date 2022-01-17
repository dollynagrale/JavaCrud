package com.jdbc.example;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DBManager1 d = new DBManager1();
		d.selectData();
		
		d.insertData(104,"Yasmin",new Date(86, 7, 4),new Date(110, 7, 8));
		d.selectData();
		
		d.updateData(103,"Hetana");
		d.selectData();
		
		d.deleteData(104);
		d.selectData();
		

	}

}
