import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JAVAFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Создание кнопки
        Button btn = new Button();
        btn.setText("Нажми меня!");
        btn.setOnAction(event -> {
            System.out.println("Кнопка нажата!");
        });

        // Создание корневого контейнера и добавление в него кнопки
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Создание сцены и добавление в неё корневого контейнера
        Scene scene = new Scene(root, 300, 250);

        // Настройка и отображение основного окна приложения
        primaryStage.setTitle("JavaFX Пример");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}