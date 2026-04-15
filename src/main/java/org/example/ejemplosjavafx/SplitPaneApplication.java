package org.example.ejemplosjavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SplitPaneApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SplitPane Application");

        // Panel izquierdo
        StackPane izquierda = new StackPane();
        izquierda.getChildren().add(new Label("Izquierda"));

        // Panel derecho
        StackPane derecha = new StackPane();
        derecha.getChildren().add(new Label("Derecha"));

        // SplitPane
        SplitPane splitPane = new SplitPane();
        splitPane.getItems().addAll(izquierda, derecha);

        // Layout
        Scene scene = new Scene(splitPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}