package com.propolingo.propolinfo.controllers;

import com.propolingo.propolinfo.model.NotesModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class NotesController implements Initializable {

    @FXML public TextArea textArea;

    @FXML
    public Button save_button;
    @FXML
    public Button clear_button;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        NotesModel notesModel =new NotesModel(textArea);
        save_button.setOnMouseClicked(event-> notesModel.onClickSaveButton());
        clear_button.setOnMouseClicked(event->notesModel.onClickClearButton());
    }
}
