package com.example.GoldenCrown;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<String> fileReader(String path) throws IOException {
        List<String> kingdomMessages = new ArrayList<>();
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(path));
            String line = bufReader.readLine();
            try {
                while (line != null) {
                    kingdomMessages.add(line);
                    line = bufReader.readLine();
                }
            } finally {
                bufReader.close();
            }
        }  catch (IOException e) {
            System.out.print(e);
        }
        return kingdomMessages;
    }
}
