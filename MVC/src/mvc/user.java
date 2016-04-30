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

/**
 * user class Bussines layer
 *
 * @author Ivan R. Chenoweth <ivanchenoweth@gmail.com>
 */
public class user {

    private String username;   
    private String password;
    private userModel modelUser;
    private Boolean logged;

    public Boolean isLogged() {
        return this.logged;
    }

    public user() {
        this.modelUser = new userModel();
        this.logged=false;
    }

    public boolean login() {
        if (this.modelUser.getByUserAndPassword(this.username, this.password)) {            
            return this.logged = true;
        }
        else {
            return this.logged =false;
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public String getUsername() {
        return username;
    }    
}
