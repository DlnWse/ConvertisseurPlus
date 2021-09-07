module fr.dylan.convertisseurpro {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens fr.dylan.convertisseurpro to javafx.fxml;
    exports fr.dylan.convertisseurpro;
}