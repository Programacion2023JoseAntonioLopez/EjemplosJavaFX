module org.example.ejemplosjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejemplosjavafx to javafx.fxml;
    exports org.example.ejemplosjavafx;
}