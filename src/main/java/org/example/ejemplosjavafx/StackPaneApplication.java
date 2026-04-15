package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane sp = new StackPane();

        // Label
        Label mensaje = new Label("Haz clic en un rectángulo...");

        // Rectángulos
        Rectangle rectBottom = new Rectangle(250, 250);
        rectBottom.setFill(Color.AQUA);

        Rectangle rectMiddle = new Rectangle(200, 200);
        rectMiddle.setFill(Color.CADETBLUE);

        Rectangle rectUpper = new Rectangle(150, 150);
        rectUpper.setFill(Color.CORAL);

        // Eventos
        rectBottom.setOnMouseClicked(e -> {
            mensaje.setText("Has pulsado el rectángulo inferior");
        });

        rectMiddle.setOnMouseClicked(e -> {
            mensaje.setText("Has pulsado el rectángulo del medio");
        });

        rectUpper.setOnMouseClicked(e -> {
            mensaje.setText("Has pulsado el rectángulo superior");
        });

        // Añadir al StackPane
        sp.getChildren().addAll(rectBottom, rectMiddle, rectUpper);

        // Layout principal
        VBox root = new VBox(10, sp, mensaje);

        Scene scene = new Scene(root, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("StackPane Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}