package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToggleButtonApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ToggleButton");

        // ToggleButtons
        ToggleButton toggleButton1 = new ToggleButton("Izquierda");
        ToggleButton toggleButton2 = new ToggleButton("Derecha");
        ToggleButton toggleButton3 = new ToggleButton("Arriba");
        ToggleButton toggleButton4 = new ToggleButton("Abajo");

        // Grupo (solo uno activo)
        ToggleGroup radioGroup = new ToggleGroup();
        toggleButton1.setToggleGroup(radioGroup);
        toggleButton2.setToggleGroup(radioGroup);
        toggleButton3.setToggleGroup(radioGroup);
        toggleButton4.setToggleGroup(radioGroup);

        // HBox horizontal
        HBox hbox = new HBox(10, toggleButton1, toggleButton2, toggleButton3, toggleButton4);

        // Botón
        Button boton = new Button("Mostrar selección");

        // Label
        Label mensaje = new Label("Selecciona una opción...");

        // Evento del botón
        boton.setOnAction(e -> {
            Toggle seleccionado = radioGroup.getSelectedToggle();

            if (seleccionado != null) {
                ToggleButton tb = (ToggleButton) seleccionado;
                mensaje.setText("Has seleccionado: " + tb.getText());
            } else {
                mensaje.setText("No hay opción seleccionada");
            }
        });

        // Layout
        VBox root = new VBox(10, hbox, boton, mensaje);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
