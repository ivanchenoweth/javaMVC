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
// RightClick Project>properties Licence Header
// Change author property: Tools>Templates>Settings Button
package mvc;

/**
 * Start the Application
 * Give the flow control sequence
 * @author Ivan R. Chenoweth <ivanchenoweth@gmail.com>
 */
public class Boostrap {
    // Constructor
    String nameApp;
    ConsoleController controller;
    public Boostrap() {
        this.nameApp = "MVC login System";
        // System.out.println("Running App: "+nameApp );
        controller = new ConsoleController("Login");
    }
    // Special main starting the flow ...
    public static void main(String[] ar) {        
        Boostrap appObj;
        appObj = new Boostrap();
    }
}
