/*
 * Copyright (C) 2016 Ivan R. Chenoweth <ivanchenoweth@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan R. Chenoweth <ivanchenoweth@gmail.com>
 */
public class userModel extends DBConnection{    
    private Connection conn;
    private String DBusername;
    private String DBpassword;

    public userModel() {        
        this.conn = this.connect();
        this.DBusername="";
        this.DBpassword="";
    }
    
    public boolean getByUserAndPassword(String ParmUsername, String ParmPassword) {
        String sql ="SELECT * FROM user WHERE username=? and password=?";
        ResultSet rs = null;                
        PreparedStatement ps;        
        try {
            ps = this.conn.prepareStatement(sql);
            ps.setString(1,ParmUsername);
            ps.setString(2,ParmPassword);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(userModel.class.getName()).log(Level.SEVERE, null, ex);
        }                
        try {
            while (rs.next()) {		
		this.DBusername = rs.getString("username");
                this.DBpassword = rs.getString("password");                
                // System.out.println("DBusername: " + DBusername);
                // System.out.println("DBpassword: " + DBpassword);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(userModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.DBusername != "" && this.DBpassword != "")
            return true;
        else
            return false;
    }
    
}
