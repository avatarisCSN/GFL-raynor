import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Создаем кнопку
        Button btn = new Button();
        btn.setText("Скажи 'Привет, мир!'");
        btn.setOnAction(event -> System.out.println("Привет, мир!"));

        // Создаем компоновку и добавляем в нее кнопку
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Создаем сцену и устанавливаем ее на Stage
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Простое приложение на JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}