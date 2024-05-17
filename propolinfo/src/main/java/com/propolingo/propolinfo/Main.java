package com.propolingo.propolinfo;

import com.propolingo.propolinfo.model.Models;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane app=Models.getInstance().getViewFactory().getApp();
        Scene scene =new Scene(app);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
