package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ImageViewApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ImageView Application");

        Label mensaje = new Label("Haz clic en la imagen...");

        Image image = new Image(getClass().getResourceAsStream("/images/java.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(150);
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);

        StackPane panelImagen = new StackPane(imageView);
        panelImagen.setOnMouseClicked(e -> {
            mensaje.setText("Has pulsado la imagen");
        });

        VBox root = new VBox(10, panelImagen, mensaje);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
