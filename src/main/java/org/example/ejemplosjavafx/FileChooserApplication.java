package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileChooserApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FileChooser Application");

        FileChooser fileChooser = new FileChooser();

        // Botón
        Button button = new Button("Seleccionar archivo");

        // Label
        Label mensaje = new Label("Ningún archivo seleccionado");

        // Evento del botón
        button.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);

            if (selectedFile != null) {
                mensaje.setText("Archivo: " + selectedFile.getAbsolutePath());
            } else {
                mensaje.setText("No se seleccionó ningún archivo");
            }
        });

        // Layout
        VBox root = new VBox(10, button, mensaje);

        Scene scene = new Scene(root, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
