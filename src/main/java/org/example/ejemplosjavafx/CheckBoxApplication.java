package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CheckBox");

        // CheckBox
        CheckBox checkBox1 = new CheckBox("Rojo");
        CheckBox checkBox2 = new CheckBox("Verde");
        CheckBox checkBox3 = new CheckBox("Azul");

        // Botón
        Button boton = new Button("Mostrar selección");

        // Label para mostrar resultado
        Label mensaje = new Label("Selecciona opciones...");

        // Evento del botón
        boton.setOnAction(e -> {
            String resultado = "Seleccionados: ";

            if (checkBox1.isSelected()) {
                resultado += "Rojo ";
            }
            if (checkBox2.isSelected()) {
                resultado += "Verde ";
            }
            if (checkBox3.isSelected()) {
                resultado += "Azul ";
            }

            // Si no hay ninguno seleccionado
            if (!checkBox1.isSelected() && !checkBox2.isSelected() && !checkBox3.isSelected()) {
                resultado = "No hay opciones seleccionadas";
            }

            mensaje.setText(resultado);
        });

        // Layout vertical
        VBox root = new VBox(10, checkBox1, checkBox2, checkBox3, boton, mensaje);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}