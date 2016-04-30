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
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Return the MySQL DBConnection to the database.
 * @author Ivan R. Chenoweth <ivanchenoweth@gmail.com>
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            System.out.println("Connection Success");
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("Connecting Fail" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/mvc";
        try {
            DBConnection = DriverManager.getConnection(url, "root", "usbw");
        } 
        catch (SQLException se) {
            System.out.println("No Database "+se);
        }
        return DBConnection;
    }    
}