package org.example.terrain;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MovingDotsWithTrail extends Application {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Создаем две точки
        MovingDot fastDot = new MovingDot(WIDTH, HEIGHT, 5, 2, gc, Color.RED);
        MovingDot slowDot = new MovingDot(WIDTH, HEIGHT, 1, 1, gc, Color.BLUE);

        // Настроим анимацию
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                // Очищаем холст перед рисованием
                gc.setFill(new Color(1.0, 0.96, 0.86, 1.0));  // Фон с полным непрозрачным бежевым
                gc.fillRect(0, 0, WIDTH, HEIGHT);

                // Обновляем точки
                fastDot.update();
                slowDot.update();
            }
        }.start();

        // Показываем окно
        primaryStage.setScene(new Scene(new StackPane(canvas), WIDTH, HEIGHT));
        primaryStage.setTitle("Moving Dots with Trails");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}