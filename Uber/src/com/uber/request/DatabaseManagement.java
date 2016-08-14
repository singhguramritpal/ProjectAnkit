package com.uber.request;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.uber.members.Rider;

public class DatabaseManagement {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3307/uber";
	private static final String USER = "root";
	private static final String PASS = "";

	Statement stmt = null;
	PreparedStatement preparedStatement = null;

	public void insertRequest(Request request, Rider rider) throws SQLException {
		Connection con = null;
        Statement st = null;
        ResultSet rs = null;

       

        try {
            
            con = DriverManager.getConnection(URL, USER, PASS);
            st = con.createStatement();
            
            String stmt = "Insert into request (RiderId,SourceAddress,DestAddress,RideTime,VehicleType,RequestType,ReqState) values ('"+rider.getRiderId()+"','"
            										 +request.getPickUpLocation()+"','"
            										 +request.getDestination()+"','"
        
            										 +request.getBookingDate()+"','"
            										 +request.getVechicleType()+"','"
            										 +request.getRequestType()+"','"
       												 +request.getState()+"')";
            										
            st.executeUpdate(stmt);

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

	}

}
