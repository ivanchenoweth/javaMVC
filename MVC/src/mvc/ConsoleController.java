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

/**
 * Controller via Console
 * @author Ivan R. Chenoweth <ivanchenoweth@gmail.com>
 */
public class ConsoleController {
    user currentUser;
    ConsoleInputLoginView loginview;
    public ConsoleController(String MVCevent) {        
        this.loginview = new ConsoleInputLoginView();
        switch (MVCevent) {
             case "Login":
                 this.login_action();                 
                 break;
             case "Menu": 
                 System.out.println("Menu");
                 break;
        }
        // 
    }
    private void login_action() {
        this.currentUser = new user();          
        loginview.inputUserPassword(this.currentUser);
        if(this.currentUser.login()) {
            this.loginview.showLabel("Usuario conectado");
        }
        else {
            this.loginview.showLabel("Usuario no encontrado " + this.currentUser.getUsername());            
        }
    }
}

