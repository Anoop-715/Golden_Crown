package com.example.GoldenCrown;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileInputReader {

public static boolean isPathValid(String path) {

        File file = new File(path);
        if (file.isDirectory()) {
           return  true;
        } else {
            return  false;
        }
    }

    public static List<String> fileReader(String path) throws IOException {
        List<String> kingdomMessages = new ArrayList<>();
        try {
            FileReader fr=new FileReader(path);
            BufferedReader bufReader = new BufferedReader(fr);
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
