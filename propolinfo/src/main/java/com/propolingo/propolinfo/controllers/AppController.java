package com.propolingo.propolinfo.controllers;

import javafx.fxml.FXML;

import javafx.scene.layout.BorderPane;

public class AppController   {

    @FXML
    public BorderPane app_borderpane;

    public BorderPane getApp()
    {
        return app_borderpane;
    }
}