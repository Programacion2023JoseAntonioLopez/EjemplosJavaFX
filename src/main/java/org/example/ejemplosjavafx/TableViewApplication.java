package org.example.ejemplosjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TableView Application");

        TableView<Persona> tableView = new TableView<>();

        TableColumn<Persona, String> column1 = new TableColumn<>("Nombre");
        TableColumn<Persona, String> column2 = new TableColumn<>("Apellido");
        TableColumn<Persona, String> column3 = new TableColumn<>("Teléfono");

        column1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        column2.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        column3.setCellValueFactory(new PropertyValueFactory<>("telefono"));

        tableView.getColumns().addAll(column1, column2, column3);

        tableView.getItems().add(new Persona("David", "Ortega", "966112233"));
        tableView.getItems().add(new Persona("Alejandro", "Aguilar", "966445566"));
        tableView.getItems().add(new Persona("Julián", "Benasque", "966778899"));
        tableView.getItems().add(new Persona("María", "Castaños", "966001122"));

        // Label para mostrar selección
        Label mensaje = new Label("Selecciona una fila...");

        // Evento al seleccionar fila
        tableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                mensaje.setText("Seleccionado: "
                        + newSel.getNombre() + " "
                        + newSel.getApellido() + " - "
                        + newSel.getTelefono());
            }
        });

        VBox root = new VBox(10, tableView, mensaje);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
