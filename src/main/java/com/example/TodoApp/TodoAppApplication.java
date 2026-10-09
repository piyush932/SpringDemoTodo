package com.example.TodoApp;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach((entry)->System.setProperty(entry.getKey(),entry.getValue()));
        System.out.println("MAIN METHOD EXECUTED");
        System.out.println("PORT" + " " + System.getProperty("SERVER_PORT"));
        SpringApplication.run(TodoAppApplication.class, args);
        System.out.println("Hello World, Your application started at");
	}

}
