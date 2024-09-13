package org.example;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello, World!");
            writer.flush();  // Works fine
            writer.close();  // Works fine

            // Попытка записи после закрытия потока
            writer.write("This will fail.");  // Throws IllegalStateException because the stream is closed
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Убедитесь, что поток закрыт, если это не было сделано
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}