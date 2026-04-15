package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TreeView Application");

        // TreeView
        TreeView<String> treeView = new TreeView<>();

        TreeItem<String> rootItem = new TreeItem<>("Programación en Java");

        TreeItem<String> chapter1 = new TreeItem<>("Capítulo 1");
        chapter1.getChildren().addAll(
                new TreeItem<>("Apartado 1"),
                new TreeItem<>("Apartado 2")
        );

        TreeItem<String> chapter2 = new TreeItem<>("Capítulo 2");
        chapter2.getChildren().addAll(
                new TreeItem<>("Apartado 1"),
                new TreeItem<>("Apartado 2")
        );

        rootItem.getChildren().addAll(chapter1, chapter2);
        treeView.setRoot(rootItem);

        // Label
        Label mensaje = new Label("Selecciona un elemento...");

        // Evento de selección
        treeView.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                mensaje.setText("Seleccionado: " + newSel.getValue());
            }
        });

        // Layout
        VBox root = new VBox(10, treeView, mensaje);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}