package com.example.GoldenCrown;

import java.util.*;

public class GoldenCrownService {


    public static Set<Kingdom> getSupportedKingdoms(List<String> kingdomMessages) {
        Set<Kingdom> supportedKingdoms = new HashSet<>();
        for(String kingdomMessage : kingdomMessages) {
            String[] kingdomMessageArr = kingdomMessage.split(" ");
            Kingdom kingdom = Kingdom.getKingdom(kingdomMessageArr[0]);
            Boolean isKingdomSupports =  GoldenCrownService.isKingdomSupports(kingdomMessageArr[1], kingdom);
            if(isKingdomSupports) {
                supportedKingdoms.add(kingdom);
            }
        }

        return supportedKingdoms;
    }

    private static boolean isKingdomSupports(String kingdomMessage, Kingdom kingdom) {
        String decodedMessage = Cypher.decrypt(kingdomMessage, kingdom.getEmblem().length());
        return GoldenCrownService.isMessageContainsEmblem(decodedMessage, kingdom);
    }

    private static Boolean isMessageContainsEmblem(String message, Kingdom kingdom) {
        message = message.toUpperCase();
        String animalName = kingdom.getEmblem().toUpperCase();

        boolean isEmblemFound = false;
        int forwardCount = 0 ;
        int reverseCount = animalName.length()-1;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == animalName.charAt(forwardCount)) {
                forwardCount++;
                if(forwardCount == animalName.length()) {
                    isEmblemFound = true;
                    break;
                }
            }

            if (message.charAt(i) == animalName.charAt(reverseCount)) {
                reverseCount--;
                if(reverseCount < 0) {
                    isEmblemFound = true;
                    break;
                }
            }
        }

        return isEmblemFound;
    }
}
