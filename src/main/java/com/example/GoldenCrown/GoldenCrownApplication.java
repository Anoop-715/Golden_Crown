package com.example.GoldenCrown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class GoldenCrownApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(GoldenCrownApplication.class, args);
//		String kingdomMessage = "AIR ROZO";

		//read the message from a file
		// param to a static method in the file reader file location

		String path ="C:\\Users\\DELL\\Downloads\\GreekTrust_Input.txt ";
		List<String> kingdomMessages =  FileInputReader.fileReader(path);



//		List<String> kingdomMessages = List.of("AIR ROZO", "LAND FAIJWJSOOFAMAU");
		Set<Kingdom> supportedKingdoms = GoldenCrownService.getSupportedKingdoms(kingdomMessages);
		if(supportedKingdoms.size()>0){
			System.out.print(Kingdom.SPACE.name()+ " ");
			supportedKingdoms.forEach(kingdom -> System.out.print(kingdom.name()+" "));
		} else {
			System.out.print("NONE");
		}

	}

}
