package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ComboBox");

        // ComboBox
        ComboBox<String> comboBox = new ComboBox<>();

        comboBox.getItems().add("Opción 1");
        comboBox.getItems().add("Opción 2");
        comboBox.getItems().add("Opción 3");
        //permite introducir valores
        comboBox.setEditable(true);

        // Label
        Label mensaje = new Label("Selecciona o escribe una opción...");

        // Evento cuando cambia la selección
        comboBox.setOnAction(e -> {
            String seleccion = comboBox.getValue();

            if (seleccion != null && !seleccion.isEmpty()) {
                mensaje.setText("Has seleccionado: " + seleccion);
            } else {
                mensaje.setText("No hay selección");
            }
        });
        //asignar evento al Combobox
        /*comboBox.valueProperty().addListener(
                (observableValue, old, nuevo) ->
                        mensaje.setText(nuevo)
        );*/

        // Layout
        VBox root = new VBox(10, comboBox, mensaje);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
