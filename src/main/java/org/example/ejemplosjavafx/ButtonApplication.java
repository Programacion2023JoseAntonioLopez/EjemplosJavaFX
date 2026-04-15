package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.IOException;

public class ButtonApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Button Application");

        // Label para mostrar mensajes
        Label mensaje = new Label("Pulsa un botón...");

        // Botón 1
        Button button1 = new Button("OK");
        button1.setOnAction(e -> {
            mensaje.setText("Has pulsado el botón OK");
        });

        Button button2;
        Button button3;

        // Botón 2 con imagen
        try {
            Image image = new Image(getClass().getResourceAsStream("/images/icon2.png"));
            button2 = new Button("", new ImageView(image));
        } catch (Exception e) {
            button2 = new Button("Micrófono");
        }

        button2.setOnAction(e -> {
            mensaje.setText("Has pulsado el botón Micrófono");
        });

        // Botón 3 con imagen
        try {
            Image image = new Image(getClass().getResourceAsStream("/images/icon3.png"));
            button3 = new Button("", new ImageView(image));
        } catch (Exception e) {
            button3 = new Button("Altavoz");
        }
        //asignamos evento
        button3.setOnAction(e -> {
            mensaje.setText("Has pulsado el botón Altavoz");
        });

        // Layout vertical (botones + label)
        VBox root = new VBox(10, button1, button2, button3, mensaje);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

