package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, World!");
            writer.flush();  // Works fine
            writer.close();  // Works fine

            // Попытка записи после закрытия потока
            writer.write("This will fail.");  // Throws IllegalStateException because the stream is closed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}