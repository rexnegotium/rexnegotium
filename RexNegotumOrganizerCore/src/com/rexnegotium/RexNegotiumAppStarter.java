package com.rexnegotium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RexNegotiumAppStarter {
	public static final String APP_VERSION = "0.0.1";

	public static void main(String[] args) throws IOException {
							
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println(String.format("Rex Negotium GTD Personal Planner! v.%s", APP_VERSION));
		
		// todo - add simple authentication here;
		
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
					System.out.println("READ ALL method will be called here!");
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
}
