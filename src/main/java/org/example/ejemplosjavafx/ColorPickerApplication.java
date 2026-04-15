package org.example.ejemplosjavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorPickerApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ColorPicker Application");

        // ColorPicker
        ColorPicker colorPicker = new ColorPicker();

        // Label
        Label mensaje = new Label("Selecciona un color...");

        // Evento cuando cambia el color
        colorPicker.setOnAction(e -> {
            Color color = colorPicker.getValue();
            mensaje.setText("Color seleccionado: " + color.toString());
        });

        // Layout
        VBox root = new VBox(10, colorPicker, mensaje);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
