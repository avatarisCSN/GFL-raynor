package org.example.exceptiongame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main extends Application {

    private Map<String, String> flashcards = new HashMap<>();
    private String currentException;
    private Label exceptionLabel = new Label();
    private TextField answerField = new TextField();
    private Button checkButton = new Button("Check Answer");
    private Label resultLabel = new Label();

    @Override
    public void start(Stage primaryStage) {
        flashcards.put("InputMismatchException", "Ввод не соответствует ожидаемому типу данных");
        flashcards.put("NoSuchElementException", "Запрашиваемый элемент отсутствует");
        flashcards.put("IllegalArgumentException", "Метод получил неподходящий или некорректный аргумент");
        flashcards.put("NumberFormatException", "Строка не может быть преобразована в число");

        nextFlashcard();

        checkButton.setOnAction(e -> checkAnswer());

        VBox vbox = new VBox(10, exceptionLabel, answerField, checkButton, resultLabel);
        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Flashcards Game");
        primaryStage.show();
    }

    private void nextFlashcard() {
        Random random = new Random();
        Object[] exceptions = flashcards.keySet().toArray();
        currentException = (String) exceptions[random.nextInt(exceptions.length)];
        exceptionLabel.setText("What is the reason for: " + currentException + "?");
        answerField.clear();
        resultLabel.setText("");
    }

    private void checkAnswer() {
        String userAnswer = answerField.getText();
        String correctAnswer = flashcards.get(currentException);

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            resultLabel.setText("Correct!");
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Incorrect");
            alert.setHeaderText("The correct answer is:");
            alert.setContentText(correctAnswer);
            alert.showAndWait();
        }

        nextFlashcard();
    }

    public static void main(String[] args) {
        launch(args);
    }
}