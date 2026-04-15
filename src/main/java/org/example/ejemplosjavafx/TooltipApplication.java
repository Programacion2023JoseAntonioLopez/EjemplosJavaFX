package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TooltipApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ToolTip Application");

        // Tooltip
        Tooltip tooltip = new Tooltip("Pulsar OK");

        // Botón
        Button button = new Button("OK");
        button.setTooltip(tooltip);

        // Label
        Label mensaje = new Label("Pulsa el botón...");

        // Evento del botón
        button.setOnAction(e -> {
            mensaje.setText("Has pulsado el botón OK");
        });

        // Layout
        VBox root = new VBox(10, button, mensaje);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}