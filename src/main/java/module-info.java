module poo_examples {
    requires javafx.controls;
    requires javafx.fxml;

    opens poo_examples.javafx.controller to javafx.fxml;
    opens poo_examples.javafx.model to javafx.base;
    exports poo_examples.javafx;
}
