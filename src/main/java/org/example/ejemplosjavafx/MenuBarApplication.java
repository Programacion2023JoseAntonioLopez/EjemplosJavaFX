package org.example.ejemplosjavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuBarApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MenuBar Application");

        Label mensaje = new Label("Selecciona una opción del menú...");

        // 🔹 Menú 1 con iconos
        Menu menu1 = new Menu("Menu 1");

        Image icon1 = new Image(getClass().getResourceAsStream("/images/icon2.png"));
        Image icon2 = new Image(getClass().getResourceAsStream("/images/icon3.png"));

        MenuItem menuItem1 = new MenuItem("Opción 1", new ImageView(icon1));
        MenuItem menuItem2 = new MenuItem("Opción 2", new ImageView(icon2));

        menuItem1.setOnAction(e -> mensaje.setText("Has seleccionado: Opción 1"));
        menuItem2.setOnAction(e -> mensaje.setText("Has seleccionado: Opción 2"));

        menu1.getItems().addAll(menuItem1, menuItem2);

        // 🔹 Menú 2 (Check)
        Menu menu2 = new Menu("Menu 2");
        CheckMenuItem check1 = new CheckMenuItem("Check 1");
        CheckMenuItem check2 = new CheckMenuItem("Check 2");

        check1.setOnAction(e -> mensaje.setText("Check 1: " + (check1.isSelected() ? "Activado" : "Desactivado")));
        check2.setOnAction(e -> mensaje.setText("Check 2: " + (check2.isSelected() ? "Activado" : "Desactivado")));

        menu2.getItems().addAll(check1, check2);

        // 🔹 Menú 3 (Radio)
        Menu menu3 = new Menu("Menu 3");
        RadioMenuItem radio1 = new RadioMenuItem("RadioButton 1");
        RadioMenuItem radio2 = new RadioMenuItem("RadioButton 2");

        ToggleGroup toggleGroup = new ToggleGroup();
        radio1.setToggleGroup(toggleGroup);
        radio2.setToggleGroup(toggleGroup);

        radio1.setOnAction(e -> mensaje.setText("Seleccionado: RadioButton 1"));
        radio2.setOnAction(e -> mensaje.setText("Seleccionado: RadioButton 2"));

        menu3.getItems().addAll(radio1, radio2);

        // MenuBar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menu1, menu2, menu3);

        VBox root = new VBox(menuBar, mensaje);

        Scene scene = new Scene(root, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}