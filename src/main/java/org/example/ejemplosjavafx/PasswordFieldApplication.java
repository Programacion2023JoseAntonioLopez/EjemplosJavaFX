package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswordFieldApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("PasswordField Application");

        // PasswordField
        PasswordField passwordField = new PasswordField();

        // Botón
        Button boton = new Button("Mostrar contraseña");

        // Label
        Label mensaje = new Label("La contraseña aparecerá aquí...");

        // Evento del botón
        boton.setOnAction(e -> {
            String password = passwordField.getText();
            mensaje.setText("Contraseña: " + password);
        });

        // Layout
        VBox root = new VBox(10, passwordField, boton, mensaje);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
