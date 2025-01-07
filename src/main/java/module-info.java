module eu.andreatt.ejercicio3jr_dein {
    requires javafx.controls;
    requires javafx.fxml;
    requires jasperreports;
    requires java.sql;


    exports eu.andreatt.ejercicio3jr_dein.controller;
    opens eu.andreatt.ejercicio3jr_dein.controller to javafx.fxml;
    exports eu.andreatt.ejercicio3jr_dein.application;
    opens eu.andreatt.ejercicio3jr_dein.application to javafx.fxml;
}