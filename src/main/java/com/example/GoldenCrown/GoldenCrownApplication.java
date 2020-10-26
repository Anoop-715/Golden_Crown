package com.example.GoldenCrown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.*;

@SpringBootApplication
public class GoldenCrownApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(GoldenCrownApplication.class, args);
		List<String> kingdomMessages = new ArrayList<>();
		String path ="C:\\Users\\DELL\\Downloads\\";
		boolean isPathValid = FileInputReader.isPathValid(path) ;
		if(isPathValid) { kingdomMessages = FileInputReader.fileReader(path); }
		else { System.out.print("Path given is wrong "); }

		Set<Kingdom> supportedKingdoms = GoldenCrownService.getSupportedKingdoms(kingdomMessages);
		if(supportedKingdoms.size()>0){
			System.out.print(Kingdom.SPACE.name()+ " ");
			supportedKingdoms.forEach(kingdom -> System.out.print(kingdom.name()+" "));
		} else {
			System.out.print("NONE");
		}

	}

}
