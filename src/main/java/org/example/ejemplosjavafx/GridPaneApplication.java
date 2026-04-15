package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GridPaneApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        // Label
        Label mensaje = new Label("Pulsa un botón...");

        // Crear botones con eventos
        Button b00 = new Button("Posicion 0, 0");
        b00.setOnAction(e -> mensaje.setText("Has pulsado: 0, 0"));

        Button b10 = new Button("Posicion 1, 0");
        b10.setOnAction(e -> mensaje.setText("Has pulsado: 1, 0"));

        Button b01 = new Button("Posicion 0, 1");
        b01.setOnAction(e -> mensaje.setText("Has pulsado: 0, 1"));

        Button b11 = new Button("Posicion 1, 1");
        b11.setOnAction(e -> mensaje.setText("Has pulsado: 1, 1"));

        Button b02 = new Button("Posicion 0, 2");
        b02.setOnAction(e -> mensaje.setText("Has pulsado: 0, 2"));

        Button b12 = new Button("Posicion 1, 2");
        b12.setOnAction(e -> mensaje.setText("Has pulsado: 1, 2"));

        // Añadir al grid
        grid.add(b00, 0, 0);
        grid.add(b10, 1, 0);
        grid.add(b01, 0, 1);
        grid.add(b11, 1, 1);
        grid.add(b02, 0, 2);
        grid.add(b12, 1, 2);

        // Layout principal
        VBox root = new VBox(10, grid, mensaje);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GridPane Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
