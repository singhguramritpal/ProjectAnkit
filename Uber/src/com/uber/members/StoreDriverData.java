package com.uber.members;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoreDriverData {
	
	Driver driver;
	
	public StoreDriverData(Driver driver){
		this.driver = driver;
		connect();
	}
	
	public void connect(){
		Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3307/uber";
        String user = "root";
        String password = "";

        try {
            
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

            String stmt = "Insert into driver (DriverName,Address,Phone,DOB,DriverLicenseNumber,VehicleColor,VehicleRegNumber,VehicleType,Email,Password,DriverRating,DriverStatus) values ('"+driver.getName()+"','"
            										 +driver.getAddress()+"','"
            										 +driver.getPhone()+"','"
            										 +driver.getDob()+"','"
            										 +driver.getLicenseNumber()+"','"
            										 +driver.getVehicleColor()+"','"
            										 +driver.getVehicleRegNumber()+"','"
       												 +driver.getVehicleType()+"','"
            										 +driver.getEmail()+"','"
            										 +driver.getPass()+"','0','offline')";
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
