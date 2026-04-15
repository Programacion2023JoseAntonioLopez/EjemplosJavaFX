package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SliderApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Slider Application");

        // Slider
        Slider slider = new Slider(0, 30, 10);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(10);
        slider.setMinorTickCount(2);
        slider.setSnapToTicks(true);

        // Label
        Label mensaje = new Label("Valor: 10");

        // Evento cuando cambia el valor
        slider.valueProperty().addListener((obs, oldVal, newVal) -> {
            mensaje.setText("Valor: " + newVal.intValue());
        });

        // Layout
        VBox root = new VBox(10, slider, mensaje);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}