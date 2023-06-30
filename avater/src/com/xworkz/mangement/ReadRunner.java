package com.xworkz.mangement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			String tableQuery = "select * from coustomer where id=3";

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "Xworkzodc@123");
			Statement sta = con.createStatement();
			ResultSet readResult = sta.executeQuery(tableQuery);

			System.out.println(readResult);
			// System.out.println(readResult.toString());

			if (readResult != null) {
				while (readResult.next()) {
					System.out.println(readResult.getInt(1) + "  " + readResult.getString(2) + "  "
							+ readResult.getInt(3) + "  " + readResult.getInt(4) + "  " + readResult.getString(5) + " "
							+ readResult.getString(6) + "  " + readResult.getString(7) + "  " + readResult.getString(8)
							+ "  " + readResult.getString(9) + "  " + readResult.getInt(10));
				}
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
