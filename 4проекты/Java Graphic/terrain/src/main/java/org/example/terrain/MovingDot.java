package org.example.terrain;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.LinkedList;

public class MovingDot {
    private double x, y;  // Текущая позиция точки
    private double dx, dy;  // Скорость по осям
    private final double width, height;  // Размеры экрана
    private final GraphicsContext gc;
    private final Color color;

    // Список следов с временными метками
    private final LinkedList<Trail> trail = new LinkedList<>();
    private final int maxTrailSize = 100; // Максимальное количество следов

    public MovingDot(double width, double height, double dx, double dy, GraphicsContext gc, Color color) {
        this.width = width;
        this.height = height;
        this.dx = dx;
        this.dy = dy;
        this.gc = gc;
        this.color = color;

        this.x = width / 2;
        this.y = height / 2;
    }

    // Класс для хранения координат и времени жизни следа
    private static class Trail {
        double x, y;
        long timestamp;  // Время, когда след был оставлен

        Trail(double x, double y, long timestamp) {
            this.x = x;
            this.y = y;
            this.timestamp = timestamp;
        }
    }

    public void update() {
        // Двигаем точку
        x += dx;
        y += dy;

        // Проверяем, не вышла ли точка за границы экрана
        if (x <= 0 || x >= width) dx *= -1;
        if (y <= 0 || y >= height) dy *= -1;

        // Добавляем новый след с текущими координатами и временем
        trail.addFirst(new Trail(x, y, System.currentTimeMillis()));

        // Ограничиваем количество следов
        if (trail.size() > maxTrailSize) {
            trail.removeLast();
        }

        // Рисуем все следы
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < trail.size(); i++) {
            Trail t = trail.get(i);
            long age = currentTime - t.timestamp;  // Возраст следа
            double alpha = Math.max(0, 1 - (double) age / 500);  // Прозрачность зависит от возраста

            // Рисуем след с уменьшенной прозрачностью, если он старый
            gc.setFill(new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha));
            gc.fillOval(t.x - 5, t.y - 5, 10, 10);
        }

        // Рисуем саму точку (она всегда на переднем плане)
        gc.setFill(color);
        gc.fillOval(x - 5, y - 5, 10, 10);
    }

    // Метод для очистки следов, если нужно
    public void clear() {
        trail.clear();  // Очищаем список следов
    }
}