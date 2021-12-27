package com.berg.homework1212.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {

    public static void main(String[] args) throws FileNotFoundException {
        File file = Path.of("resources/text.txt").toFile();
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[fileInputStream.available()];
            int count = 0;
            byte currentByte = 0;
            while ((currentByte = (byte) fileInputStream.read()) != -1){
                bytes[count++] = currentByte;
            }


            String stringValue = new String(bytes);
            System.out.println(stringValue);

//            byte[] allBytes = fileInputStream.readAllBytes();
//            String stringValue = new String(allBytes);
//            System.out.println(stringValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
