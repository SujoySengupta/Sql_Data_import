package com.java.mysql;
import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Sqlconnector {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprac", "root", "sujoy");
			System.out.println("Connection successful!");
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("Select * from emp");
			while(set.next()) {
				System.out.println(set.getInt(1) + " "+ set.getString(2));
			}
		}
		catch (Exception e) {
			System.out.println("Error: "+ e);
		}
	}

}
