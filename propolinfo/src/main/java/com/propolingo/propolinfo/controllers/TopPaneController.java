package com.propolingo.propolinfo.controllers;

import com.propolingo.propolinfo.model.Models;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TopPaneController implements Initializable {

    @FXML
    public Button propolingovideo_button;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            propolingovideo_button.setOnMouseClicked(e-> {
                try {
                    Models.getInstance().getViewFactory().playMediaPlayer();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
    }
}
