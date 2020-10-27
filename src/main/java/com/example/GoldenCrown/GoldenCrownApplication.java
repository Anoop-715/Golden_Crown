package com.example.GoldenCrown;



import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.*;

public class GoldenCrownApplication {

	public static void main(String[] args) throws IOException {


		List<String> kingdomMessages = new ArrayList<>();
		String path ="C:\\Users\\DELL\\Desktop\\Golden_Crown\\";
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
