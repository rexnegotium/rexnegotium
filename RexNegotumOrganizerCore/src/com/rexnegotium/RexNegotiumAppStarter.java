package com.rexnegotium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.rexnegotium.controller.TaskController;
import com.rexnegotium.model.Task;

public class RexNegotiumAppStarter {
	
	public static final String APP_VERSION = "0.0.1";
	
	private static TaskController taskController;

	public static void main(String[] args) throws IOException {
							
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
		taskController = new TaskController();
		
		System.out.println(String.format("Rex Negotium GTD Personal Planner! v.%s", APP_VERSION));
		
		// todo - add simple authentication here;
		
		String userCommandString;
		while (true) {
			
			System.out.print("Type command: ");
			userCommandString = consoleReader.readLine();
			
			switch(userCommandString) {
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
		List<Task> allTasks = taskController.getAll();
		
		// print all tasks
		for (Task task: allTasks) {
			System.out.println(task);
		}
		
	}	
}
