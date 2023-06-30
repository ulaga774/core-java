package com.xworkz.ulaga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DrinksRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("update");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oldmonk", "root",
					"Xworkzodc@123");
			System.out.println(con.getSchema());
			String query = "insert into brand values(2 ,'wshikey' , 230)";
			String query1 = "insert into brand values(3 ,'brandy' , 530)";
			java.sql.Statement set = con.createStatement();
			boolean result = set.execute(query);
			boolean result1 = set.execute(query1);
		
			System.out.println(result);
			System.out.println(result1);
			
			
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}
}
