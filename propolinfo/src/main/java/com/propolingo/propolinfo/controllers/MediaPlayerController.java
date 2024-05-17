package com.propolingo.propolinfo.controllers;

import com.propolingo.propolinfo.model.MediaPlayerModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class MediaPlayerController implements Initializable {

    @FXML
    public MediaView mediaView;
   @FXML
    public Button playback_button;
   @FXML
    public Slider slider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        MediaPlayerModel model = new MediaPlayerModel(mediaView);
        model.setUrl(getUrl());
        model.initialize();
        playback_button.setOnMouseClicked(event->model.onClickPlay(playback_button));
    }

    private String getUrl(){

        String path ="/home/bonga/Desktop/movie.mp4";
        File file = new File(path);

        if (file.exists()){
            try {
                path =file.toURI().toURL().toString();
            } catch (MalformedURLException e) {
                System.err.println(e);
            }
        }
        return path;
    }

}
