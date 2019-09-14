package com.rexnegotium;

import com.rexnegotium.controller.TaskController;
import com.rexnegotium.controller.UserController;
import com.rexnegotium.model.Task;
import com.rexnegotium.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * fixme
 * Этот класс - временный. Его мы используем только для работы админа - работа с пользователями
 * В будущем необходимо предоставить доступ к этому функционалу после аутентификации пользователям с ролью "админ"
 *
 */
public class RexNegotiumAdminAppStarter {
	
	public static final String APP_VERSION = "0.0.1";
	
	private static UserController userController;

	public static void main(String[] args) throws IOException {
							
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
		userController = new UserController();
		
		System.out.println("Rex Negotium Admin console");

		String userCommandString;
		while (true) {
			
			System.out.print("Type command: ");
			userCommandString = consoleReader.readLine();
			
			switch(userCommandString.toLowerCase()) {
				case "create" : {
					System.out.println("CREATE method will be called here!");
					break;
				}
				case "read" : {
					System.out.println("READ method will be called here!");
					break;
				}
				case "readall" : {
					readAll();
					break;
				}
				case "update" : {
					System.out.println("UPDATE method will be called here!");
					break;
				}
				case "delete" : {
					System.out.println("DELETE method will be called here!");
					break;
				}
				
				case "help": {
					System.out.println("HELP method will be called here!");
					break;
				}
				case "exit": {
					System.out.println("EXIT method will be called here!");
					return;
				}
				
				default : {
					System.out.println("Undefined method will be called here!");
					break;
				}
			}
				
		}
		
	}

	private static void readAll() {
		System.out.println("performing readAll()... ");
		List<User> allUsers = userController.getAll();
		
		// print all tasks
		for (User user: allUsers) {
			System.out.println(user);
		}
		
	}	
}
