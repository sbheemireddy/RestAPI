package project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import test.RestAPIProgram1;
import test.program1Execute;

@SpringBootApplication
public class Program2 {

	public static void main(String[] args) {
		SpringApplication.run(project1.Program2.class, args);
		new RestAPIProgram1();
		new program1Execute().configuration();
		
		

	}

}
