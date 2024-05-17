package com.propolingo.propolinfo.views;

import javafx.animation.FadeTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ViewFactory {
    private BorderPane app;
    private String resources = "src/main/resources/fxml/";

    private URL getUrl(String Url) throws IOException {
        return new File(Url).toURI().toURL();
    }

    private Pane load(String url) throws IOException {
        return FXMLLoader.load(getUrl(url));
    }

    public BorderPane getApp() throws IOException {
        if (app == null)
            app = (BorderPane) load((resources + "app.fxml"));
        return app;
    }

    public void playMediaPlayer() throws IOException {
        AnchorPane anchorPane =(AnchorPane)load((resources+"media_player.fxml"));
        Scene scene =new Scene(anchorPane);
        Stage stage =new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
public void getNotes() throws IOException
{
    AnchorPane notespane = (AnchorPane)load((resources+"notes.fxml"));
    Scene scene =new Scene(notespane);
    Stage stage =new Stage();
    stage.setScene(scene);
    stage.show();

}
    public void setCenter() throws IOException {
        AnchorPane symbolsLesson = (AnchorPane) load((resources + "symbolsnotes.fxml"));

        if (getApp().getCenter() != null) {
            FadeTransition fadeOut = new FadeTransition(Duration.millis(500), getApp().getCenter());
            fadeOut.setFromValue(1.0);
            fadeOut.setToValue(0.0);
            fadeOut.setOnFinished(event -> {
                try {
                    getApp().setCenter(symbolsLesson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                FadeTransition fadeIn = new FadeTransition(Duration.millis(500), symbolsLesson);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                fadeIn.play();
            });
            fadeOut.play();
        } else {
            getApp().setCenter(symbolsLesson);
            FadeTransition fadeIn = new FadeTransition(Duration.millis(500), symbolsLesson);
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        }
    }
}
