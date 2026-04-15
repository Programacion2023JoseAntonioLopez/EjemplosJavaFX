package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TextField Application");

        // TextField
        TextField textField = new TextField();
        textField.setText("Escribe aquí");

        // Botón
        Button boton = new Button("Mostrar texto");

        // Label
        Label mensaje = new Label("El texto aparecerá aquí...");

        // Evento del botón
        boton.setOnAction(e -> {
            String texto = textField.getText();
            mensaje.setText("Has escrito: " + texto);
        });

        // Layout
        VBox root = new VBox(10, textField, boton, mensaje);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
