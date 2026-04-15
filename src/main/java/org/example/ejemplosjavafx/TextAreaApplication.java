package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextAreaApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TextArea Application");

        // TextArea
        TextArea textArea = new TextArea("Escribe aquí\nen múltiples\nlíneas");

        // Botón
        Button boton = new Button("Mostrar texto");

        // Label
        Label mensaje = new Label("El contenido aparecerá aquí...");

        // Evento del botón
        boton.setOnAction(e -> {
            String texto = textArea.getText();
            mensaje.setText("Contenido:\n" + texto);
        });

        // Layout
        VBox root = new VBox(10, textArea, boton, mensaje);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
