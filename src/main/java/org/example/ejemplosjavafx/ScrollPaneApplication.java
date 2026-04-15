package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScrollPaneApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ScrollPane Application");

        // TextArea
        TextArea textArea = new TextArea("Escribe aquí\nen múltiples\nlíneas" +
                " larguíiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiisimas" +
                "\ny otra\ny otra\ny otra\ny otra\ny otra\ny otra");

        // ScrollPane
        ScrollPane scrollPane = new ScrollPane(textArea);


        // Layout
        VBox root = new VBox(10, scrollPane);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
