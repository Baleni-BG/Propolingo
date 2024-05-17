module com.propolingo.propolinfo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires de.jensd.fx.glyphs.fontawesome;


    opens com.propolingo.propolinfo to javafx.fxml;
    exports com.propolingo.propolinfo;
    exports com.propolingo.propolinfo.controllers;
    exports com.propolingo.propolinfo.views;
    exports com.propolingo.propolinfo.model;

}