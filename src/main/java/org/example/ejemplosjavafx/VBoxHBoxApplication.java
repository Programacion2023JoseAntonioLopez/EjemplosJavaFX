package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxHBoxApplication extends Application {

    @Override
    public void start(Stage stage) {

        // Label
        Label mensaje = new Label("Pulsa un botón...");
        // Botones
        Button b1 = new Button("Botón 1");
        Button b2 = new Button("Botón 2");
        Button b3 = new Button("Botón 3");

        // Eventos
        b1.setOnAction(e -> mensaje.setText("Has pulsado Botón 1"));
        b2.setOnAction(e -> mensaje.setText("Has pulsado Botón 2"));
        b3.setOnAction(e -> mensaje.setText("Has pulsado Botón 3"));

        // HBox (horizontal)
        HBox hbox = new HBox(10, b1, b2, b3);
        hbox.setAlignment(Pos.CENTER);

        // VBox (vertical)
        VBox vbox = new VBox(15, hbox, mensaje);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 300, 200);
        stage.setScene(scene);
        stage.setTitle("VBox + HBox");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
