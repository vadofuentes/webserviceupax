
package com.service.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conn = null;
    try {
       CallableStatement stmt = conn.prepareCall(“{? = call ZEUS.PAEMPLOYEES.FNINSERT(?,?,?,?,?)}“);

            Class.forName()
        } catch(SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
        }
    
}
