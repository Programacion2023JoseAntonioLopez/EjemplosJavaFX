package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToolBarApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        final int NUM_ICONS = 4;

        primaryStage.setTitle("ToolBar Application");

        ToolBar toolBar = new ToolBar();

        // Label para mostrar mensaje
        Label mensaje = new Label("Pulsa un botón...");

        for (int i = 1; i <= NUM_ICONS; i++) {

            int numero = i; // necesario para lambda

            // Cargar imagen
            Image image = new Image(
                    getClass().getResourceAsStream("/images/icon" + i + ".png")
            );

            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(30);
            imageView.setPreserveRatio(true);

            Button button = new Button("", imageView);

            // Evento del botón
            button.setOnAction(e -> {
                mensaje.setText("Has pulsado el botón " + numero);
            });

            toolBar.getItems().add(button);
        }

        VBox root = new VBox(10, toolBar, mensaje);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}