package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/example.txt"))) {
            // Открытие и чтение файла
            String line = reader.readLine();
            System.out.println(line);

            // Попытка повторного закрытия файла
            reader.close();  // Works fine
            reader.readLine();  // Throws IllegalStateException because the stream is already closed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}