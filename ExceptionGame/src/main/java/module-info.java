module org.example.exceptiongame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.exceptiongame to javafx.fxml;
    exports org.example.exceptiongame;
}