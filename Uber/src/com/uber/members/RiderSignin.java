package com.uber.members;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RiderSignin {
	
	public RiderSignin(){
		signIn();
	}

	public void signIn(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Username/EmailId: ");
		String email = sc.nextLine();
		System.out.println("Enter Password: ");
		String pass = sc.nextLine();
		System.out.println(checkRider(email,pass));
	}

	public String checkRider(String email, String pass){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3307/uber";
		String user = "root";
		String password = "";

		try {

			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			
			String stmt = "Select * from Rider where Email = '"+email+"' and Password = '"+pass+"'";
			rs=st.executeQuery(stmt);

			if(rs.next()){
				return "Driver is Signed in";
			}

		} catch (SQLException ex) {

			System.out.println("Error: "+ex.getMessage());

		} finally {

			try {

				if (rs != null) {
					rs.close();
				}

				if (st != null) {
					st.close();
				}

				if (con != null) {
					con.close();
				}

			} catch (SQLException ex) {

				System.out.println("Error: "+ex.getMessage());
			}
		}
		return "Username or password is Wrong";
	}
	
	

}
