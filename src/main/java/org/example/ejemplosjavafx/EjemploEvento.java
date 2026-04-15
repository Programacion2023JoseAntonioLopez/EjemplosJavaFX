package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class EjemploEvento extends Application {

    @Override
    public void start(Stage stage) {

        // 1. Crear componentes
        Button boton = new Button("Pulsa aquí");
        Label mensaje = new Label("Esperando acción...");

        // 2. Evento del botón
        boton.setOnAction(e -> {
            mensaje.setText("¡Botón pulsado!");
        });

        // 3. Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(boton, mensaje);

        // 4. Escena
        Scene scene = new Scene(root, 300, 200);

        // 5. Ventana
        stage.setTitle("Ejemplo Eventos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

