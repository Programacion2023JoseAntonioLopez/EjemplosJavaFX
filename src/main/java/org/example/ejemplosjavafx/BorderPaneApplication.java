package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane raiz = new BorderPane();

        // Label
        Label mensaje = new Label("Pulsa un botón...");

        // Botones
        Button top = new Button("TOP");
        Button bottom = new Button("BOTTOM");
        Button left = new Button("LEFT");
        Button right = new Button("RIGHT");
        Button center = new Button("CENTER");

        // Eventos
        top.setOnAction(e -> mensaje.setText("Has pulsado: TOP"));
        bottom.setOnAction(e -> mensaje.setText("Has pulsado: BOTTOM"));
        left.setOnAction(e -> mensaje.setText("Has pulsado: LEFT"));
        right.setOnAction(e -> mensaje.setText("Has pulsado: RIGHT"));
        center.setOnAction(e -> mensaje.setText("Has pulsado: CENTER"));

        // Posiciones
        raiz.setTop(top);
        raiz.setBottom(bottom);
        raiz.setLeft(left);
        raiz.setRight(right);
        raiz.setCenter(center);

        // Layout principal
        VBox root = new VBox(10, raiz, mensaje);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
