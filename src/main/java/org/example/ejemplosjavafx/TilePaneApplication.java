package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TilePaneApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        TilePane tile = new TilePane();
        tile.setPrefColumns(6);
        tile.setPrefRows(4);

        // Label
        Label mensaje = new Label("Pulsa un botón...");

        // Crear botones con evento
        for (int i = 0; i < 20; i++) {

            int numero = i; // necesario para lambda

            Button boton = new Button("Boton " + i);

            boton.setOnAction(e -> {
                mensaje.setText("Has pulsado: Boton " + numero);
            });

            tile.getChildren().add(boton);
        }

        // Layout principal
        VBox root = new VBox(10, tile, mensaje);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TilePane Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}