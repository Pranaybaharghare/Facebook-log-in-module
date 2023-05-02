package com.java.signup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpDao {

	public static int saveData(SignUp signup) throws FileNotFoundException, IOException {
		int res=0;
		try {
			Connection connection=TestConnection.createConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("insert into facebook_signup values(?,?,?,?,?,?)");
			System.out.println(signup);
			
			preparedStatement.setString(1, signup.getFname());
			preparedStatement.setString(2, signup.getLname());
			preparedStatement.setString(3, signup.getEmail());
			preparedStatement.setString(4, signup.getPassword());
			preparedStatement.setString(5, signup.getDate());
			preparedStatement.setString(6, signup.getGender());
			res=preparedStatement.executeUpdate();
			System.out.println(res);

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return res;
	}




}
