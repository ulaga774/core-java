package com.xworkz.facebook.repositry;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.facebook.dto.FaceBookDto;

public class FacebookRepositryimpl implements FacebookRepositry {

	@Override
	public boolean save(FaceBookDto dto) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/feacebook", "root",
				"Xworkzodc@123");
		String quary = "insert into fb_info value(?,?,?,?,?,?,?,?)";

		PreparedStatement statement = connection.prepareStatement(quary);
		statement.setInt(1, dto.getId());
		statement.setString(2, dto.getFristName());
		statement.setString(3, dto.getLastName());
		statement.setDate(4, dto.getDOB());
		statement.setString(5, dto.getEmail());
		statement.setLong(6, dto.getPhoneNumber());
		statement.setString(7, dto.getGender());
		statement.setString(8, dto.getPassword());

		int i = statement.executeUpdate();
		System.out.println(i);

		statement.close();

		return false;
	}

	@Override
	public boolean read(FaceBookDto dto) throws Exception {
		String quary = "select * from fb_info ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/feacebook", "root",
				"Xworkzodc@123");
		PreparedStatement statement = connection.prepareStatement(quary);
		ResultSet result = statement.executeQuery();
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + "--" + result.getString(2) + "--" + result.getString(3) + "--"
						+ result.getDate(4) + "--" + result.getString(5) + "--" + result.getLong(6) + "--"
						+ result.getString(7) + "--" + result.getString(8) + "--");
			}
		}
		statement.close();

		return false;
	}

	@Override
	public boolean updateBYEmail(String email, String lastName) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/feacebook", "root",
				"Xworkzodc@123");
		String quary = "update fb_info set lastName=? where email=?";
		PreparedStatement statement = connection.prepareStatement(quary);
		statement.setString(1, lastName);
		statement.setString(2, email);

		int result = statement.executeUpdate();
		System.out.println(result);

		statement.close();

		return false;
	}

	@Override
	public boolean readBYEmail(String email) throws Exception {
		String quary = "select * from fb_info where email=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/feacebook", "root",
				"Xworkzodc@123");
		PreparedStatement statement = connection.prepareStatement(quary);
		statement.setString(1, email);
		ResultSet result = statement.executeQuery();
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + "--" + result.getString(2) + "--" + result.getString(3) + "--"
						+ result.getDate(4) + "--" + result.getString(5) + "--" + result.getLong(6) + "--"
						+ result.getString(7) + "--" + result.getString(8) + "--");
			}
		}
		statement.close();

		return false;
	}

	@Override
	public boolean updateBYId(Integer id, String lastName) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/feacebook", "root",
				"Xworkzodc@123");
		String quary = "update fb_info set lastName=? where id=?";
		PreparedStatement statement = connection.prepareStatement(quary);
		statement.setString(1, lastName);
		statement.setInt(2, id);

		int result = statement.executeUpdate();
		System.out.println(result);

		statement.close();

		return false;
		
	}

	@Override
	public boolean deleteById(Integer id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/feacebook", "root",
				"Xworkzodc@123");
		String quary = "delete from fb_info where id=?";
		PreparedStatement statement = connection.prepareStatement(quary);
		
		statement.setInt(1, id);

		int delete = statement.executeUpdate();
		System.out.println(delete);

		statement.close();

		return false;
	
	}

	@Override
	public boolean update(String fristName, String lastName, Date DOB, String email, Long phoneNumber, String gender,
			String password) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/feacebook", "root",
				"Xworkzodc@123");
		String quary = "update fb_info set fristName=?,lastName=?,DOB=?,email=?,phoneNumber=?,gender=?,password=? where id=4";
		PreparedStatement statement = connection.prepareStatement(quary);
		statement.setString(1, fristName);
		statement.setString(2, lastName);
		statement.setDate(3, DOB);
		statement.setString(4, email);
		statement.setLong(5, phoneNumber);
		statement.setString(6, gender);
		statement.setString(7, password);
		
		int update = statement.executeUpdate();
		System.out.println(update);

		statement.close();
		
		
		
		return false;
	}

}
