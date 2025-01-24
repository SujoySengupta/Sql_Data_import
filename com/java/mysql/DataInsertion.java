package com.java.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.*;

//import com.mysql.cj.Query;
//import com.mysql.cj.protocol.Resultset;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class DataInsertion {
	public static void main(String[] args) {
		try {
			Scanner inp = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprac", "root", "sujoy");
		System.out.println("connection successful");
		Statement state = connect.createStatement();
		System.out.println("Enter name: ");
		String name = inp.next();
		System.out.println("Enter salary: ");
		float salary  = inp.nextFloat();
		int result = 0;
		String d="insert into emp(`empname`,`empsal`) VALUES('"+name+"','"+salary+"')";
		result=state.executeUpdate(d);
		System.out.println(result);
		ResultSet out = state.executeQuery("select * from emp");
		while(out.next()) {
			System.out.println(out.getInt(1) +" "+ out.getString(2)+" "+out.getFloat(3));
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
