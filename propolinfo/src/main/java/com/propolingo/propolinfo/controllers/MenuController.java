package com.propolingo.propolinfo.controllers;

import com.propolingo.propolinfo.model.Models;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    public Button lessons_button;
    @FXML
    public Button notes_button;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lessons_button.setOnMouseClicked(e-> {
            try {
                Models.getInstance().getViewFactory().setCenter();
            } catch (IOException ignored) {

            }
        });
        notes_button.setOnMouseClicked(e->{
            try {
                Models.getInstance().getViewFactory().getNotes();
            }catch (IOException i){}
                }
        );

    }
}
