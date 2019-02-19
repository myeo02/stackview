package com.cantina.stackview;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StackviewApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(StackviewApplication.class, args);

		//Prompt for the user input
		System.out.println("Enter input or enter 0 to exit");
		Scanner scanner = new Scanner(System.in);
		ViewHandler viewHandler = new ViewHandler();
		try {
			SystemView view = viewHandler.readViewData();
			processInput(scanner, viewHandler, view);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			System.out.println("End console");
			int code = SpringApplication.exit(ctx, () -> 0);
			System.exit(code);
		}

	}

	private static void processInput(Scanner scanner, ViewHandler viewHandler, SystemView view) {
		String input;
		while(scanner.hasNext()) {
			input = scanner.nextLine();
			System.out.println("You have entered "+input);
			if (input.trim().isEmpty()) {
				System.out.println("You have entered empty string");
			} else if (input.trim().equals("0")) {
				break;
			} else {
				viewHandler.printData(input, view);
			}
		}
	}

}

