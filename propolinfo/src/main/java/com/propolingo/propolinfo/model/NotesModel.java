package com.propolingo.propolinfo.model;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class NotesModel {
    private final TextArea textArea;

    public NotesModel(TextArea textArea) {
        this.textArea=textArea;
    }

    public void onClickClearButton()
    {
        textArea.setText("");
    }

    public void onClickSaveButton()
    {
        // No implementation yet, as not connected to database.
    }
}
