package org.example;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        System.out.println("Текущая директория: " + new File(".").getAbsolutePath());

        Set<String> itemNames = new HashSet<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]+(?: [a-zA-Z]+)*"); // Ищем название товара

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            boolean recording = false;
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains("Сегодня") || line.contains("Вчера")) {
                    recording = true;
                    System.out.println("2");
                    continue;
                } else if (line.toLowerCase().contains("ign")) {
                    System.out.println("3");
                    recording = false;
                    continue;
                }

                if (recording) {
                    System.out.println("4");
                    Matcher matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        itemNames.add(matcher.group());
                    }
                }
            }

            for (String item : itemNames) {
                writer.write(item);
                writer.newLine();
            }
        }

        System.out.println("Обработка завершена. Уникальные названия сохранены в " + outputFile);
    }
}