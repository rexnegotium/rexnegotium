package com.rexnegotium;

import com.rexnegotium.controller.TaskController;
import com.rexnegotium.controller.UserController;
import com.rexnegotium.model.Role;
import com.rexnegotium.model.Task;
import com.rexnegotium.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
					create(consoleReader);
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

	private static void create(BufferedReader consoleReader) {
		System.out.println("Создание нового пользователя");

		// 1. - Проверяем имя - не должно быть пустым
		String name =  null;
		while (name == null) {

			try {

				System.out.print("Введите имя:");
				name = consoleReader.readLine();

				if (name == null || name.isEmpty()){
					System.out.println("Введено пустое имя. Повторите ввод!");
					name = null;
					continue;
				};

			} catch (IOException e) {
				// todo - log exception here
				System.out.println("Произошла ошибка!");
				name = null;
			}
		}

		// 2. - Проверяем EMail - не должно быть пустым и должно соответствовать формату email.
		String email = null;
		while (email == null) {

			try {

				System.out.print("Введите EMail:");
				email = consoleReader.readLine();

				if (email == null || email.isEmpty()){
					System.out.println("Введен пустй email. Повторите ввод!");
					email = null;
					continue;
				};

				// Проверяем, что был введён EMail, а не какая-то левая строка.
				// Проверку производим с помощью регулярных выражений.
				// Паттерн взял отсюда: https://howtodoinjava.com/regex/java-regex-validate-email-address/
				String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(email);
				if (!matcher.matches()) {
					System.out.println("Введеный email имеет неправильный формат. Повторите ввод!");
					email = null;
					continue;
				}

			} catch (IOException e) {
				// todo - log exception here
				System.out.println("Произошла ошибка!");
				email = null;
			}
		}

		// 3. Проверяем пароль.
		// Не будем накидывать слишком много ограничений. 6-16 символов и цифра
		System.out.println("Введите пароль. Пароль должен состоять 6-16 символов, включая цифры и латинские буквы в разном регистре.");
		char[] password = null;
		while (password == null) {

			try {

				String passwordStr = consoleReader.readLine();

				if (passwordStr == null || passwordStr.isEmpty()){
					System.out.println("Введен пустй Пароль. Повторите ввод!");
					System.out.print("Введите Пароль:");
					password = null;
					continue;
				};

				// Проверяем, что был введён корректный пароль.
				// Проверку производим с помощью регулярных выражений.
				// Паттерн взял отсюда: https://howtodoinjava.com/regex/java-regex-validate-email-address/
				String regex = "((?=.*[a-z])(?=.*[A-Z])(?=.*d).{6,16})";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(passwordStr);
				if (!matcher.matches()) {
					System.out.println("Введеный пароль имеет неправильный формат. Пароль должен состоять 6-16 символов, включая цифры и латинские буквы в разном регистре.. Повторите ввод!");
					System.out.print("Введите Пароль:");
					password = null;
					continue;
				}

				// todo - hash password right here
				password = passwordStr.toCharArray();

			} catch (IOException e) {
				// todo - log exception here
				System.out.println("Произошла ошибка!");
				System.out.print("Введите Пароль:");
				password = null;
			}
		}

		LocalDate registeredDate = LocalDate.now();

		boolean enabled = true;

		// todo - предусмотреть возможность установки роли при создании пользователя здесь.
		Set<Role> roles = new HashSet<>();
		roles.add(Role.ROLE_USER);

		User user = new User(null, name, email, password, enabled, registeredDate, roles);

		userController.create(user);

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
