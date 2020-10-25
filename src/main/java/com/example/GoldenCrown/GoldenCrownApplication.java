package com.example.GoldenCrown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class GoldenCrownApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(GoldenCrownApplication.class, args);
//		String kingdomMessage = "AIR ROZO";

		//read the message from a file
		// param to a static method in the file reader file location
//		BufferedReader bufReader = new BufferedReader(new FileReader(""));
//		List<String> kingdomMessages = new ArrayList<>();
//		String line = bufReader.readLine();
//		while (line != null) {
//			kingdomMessages.add(line);
//			line = bufReader.readLine();
//		}
//		bufReader.close();


		List<String> kingdomMessages = List.of("AIR ROZO", "LAND FAIJWJSOOFAMAU");
		Set<Kingdom> supportedKingdoms = GoldenCrownService.getSupportedKingdoms(kingdomMessages);
		if(supportedKingdoms.size()>0){
			System.out.print(Kingdom.SPACE.name()+ " ");
			supportedKingdoms.forEach(kingdom -> System.out.print(kingdom.name()+" "));
		} else {
			System.out.print("NONE");
		}

	}

}
