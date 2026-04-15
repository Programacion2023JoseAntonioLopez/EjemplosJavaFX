package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TabPaneApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TabPane Application");

        // Tabs
        Tab tab1 = new Tab("Pestaña 1", new Label("Comprar"));
        Tab tab2 = new Tab("Pestaña 2", new Label("Vender"));

        TabPane tabPane = new TabPane(tab1, tab2);

        // Label
        Label mensaje = new Label("Selecciona una pestaña...");

        // Evento al cambiar de pestaña
        tabPane.getSelectionModel().selectedItemProperty().addListener((obs, oldTab, newTab) -> {
            if (newTab != null) {
                mensaje.setText("Pestaña seleccionada: " + newTab.getText());
            }
        });

        // Layout
        VBox root = new VBox(10, tabPane, mensaje);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
