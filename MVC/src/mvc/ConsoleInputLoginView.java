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

import java.util.Scanner;

/**
 * Console Input user and password to the user
 * @author Ivan R. Chenoweth <ivanchenoweth@gmail.com>
 */
public class ConsoleInputLoginView {
    public void inputUserPassword(user paramUser){
        String usuario;
        String password;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Usuario:");
        usuario=teclado.nextLine();
        System.out.print("Password:");
        password=teclado.nextLine();
        paramUser.setUsername(usuario);
        paramUser.setPassword(password);        
    }
    public void showLabel(String s) {
        System.out.println(s);
    }
}
