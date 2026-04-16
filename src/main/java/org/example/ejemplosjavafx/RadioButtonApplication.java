package org.example.ejemplosjavafx;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("RadioButton");

        // RadioButtons
        RadioButton radioButton1 = new RadioButton("Izquierda");
        RadioButton radioButton2 = new RadioButton("Derecha");
        RadioButton radioButton3 = new RadioButton("Arriba");
        RadioButton radioButton4 = new RadioButton("Abajo");

        // Grupo
        ToggleGroup radioGroup = new ToggleGroup();
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);

        // 🔹 HBox para ponerlos en horizontal
        HBox hbox = new HBox(10, radioButton1, radioButton2, radioButton3, radioButton4);

        // Botón
        Button boton = new Button("Mostrar selección");

        // Label
        Label mensaje = new Label("Selecciona una opción...");

        // Evento
        boton.setOnAction(e -> {
            Toggle seleccionado = radioGroup.getSelectedToggle();

            if (seleccionado != null) {
                RadioButton rb = (RadioButton) seleccionado;
                mensaje.setText("Has seleccionado: " + rb.getText());
            } else {
                mensaje.setText("No has seleccionado nada");
            }
        });

        //asignar evento al radiobutton
        /*radioGroup.selectedToggleProperty().addListener(
                (observableValue, viejoValor, nuevoValor) ->
                {
                    if (nuevoValor != null) {
                        RadioButton seleccionado = (RadioButton) nuevoValor;
                        mensaje.setText(seleccionado.getText());
                    }
        }
        );*/

        // Layout principal
        VBox root = new VBox(10, hbox, boton, mensaje);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}