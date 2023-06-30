package com.xworkz.avatarmovie.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.avatarmovie.dto.AvatarDto;

public class AvatarRepositoryImpl implements AvatarRepository {

	public boolean save(AvatarDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root", "Xworkzodc@123");
			System.out.println(con);
			String quaery = "insert into james_camaron values(?,?,?,?)";
			PreparedStatement sts = con.prepareStatement(quaery);
			System.out.println("inset = " + sts);

			sts.setInt(1, dto.getId());
			sts.setString(2, dto.getCast());
			sts.setInt(3, dto.getAge());
			sts.setString(4, dto.getRoleName());

			int i = sts.executeUpdate();
			System.out.println("saved = " + i);

			sts.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			String tableQuery = "select * from james_camaron where id=1";

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root", "Xworkzodc@123");
			PreparedStatement sts = con.prepareStatement(tableQuery);
			ResultSet readResult = sts.executeQuery(tableQuery);

			System.out.println(readResult);

			if (readResult != null) {
				while (readResult.next()) {
					System.out.println(readResult.getInt(1) + "  " + readResult.getString(2) + "  "
							+ readResult.getInt(3) + "  " + readResult.getString(4));
				}
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return true;
	}

	@Override
	public boolean update(AvatarDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root", "Xworkzodc@123");
//			System.out.println(con);
			String query = "update from james_camaron set id=?,cast=?,age=?,roleName=? where Id=5";
			PreparedStatement sts = con.prepareStatement(query);
			
			sts.setInt(1,dto.getId());
			sts.setString(2, dto.getCast());
			sts.setInt(3, dto.getAge());
			sts.setString(4, dto.getRoleName());
			
			int result = sts.executeUpdate(query);
			System.out.println(result);

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return true;
	}

}
