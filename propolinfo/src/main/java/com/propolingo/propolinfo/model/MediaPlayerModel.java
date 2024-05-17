package com.propolingo.propolinfo.model;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MediaPlayerModel {

    private Media media;
    private MediaPlayer mediaPlayer;
    public MediaView mediaView;
    private boolean clicked; // internal state variable of a button
    private String url;
    private final FontAwesomeIconView icon =new FontAwesomeIconView();
    public Slider slider;

    public void setUrl(String url) {
        this.url=url;
    }

    private String getUrl() {
        return url;
    }

    private Slider getSlider() {
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(0);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setBlockIncrement(5);
        return slider;
    }
    public void setSlider(Slider slider) {
        this.slider = slider;
    }

    private  Media getMedia() {
        if (media==null)
            media =new Media(getUrl());
        return media;
    }

    private MediaPlayer getMediaPlayer(){
        if(mediaPlayer==null)
            mediaPlayer=new MediaPlayer(getMedia());
        return mediaPlayer;
    }

    public void onClickPlay(Button button){

        if (!clicked)
        {
                clicked=true;
                icon.setGlyphName("PLAY");
                button.setGraphic(icon);
                getMediaPlayer().pause();

        }else {
            clicked=false;
            icon.setGlyphName("PAUSE");
            button.setGraphic(icon);
            getMediaPlayer().play();

        }

    }


    protected void  bindMediaPlayerSlider()
    {

    }

    public void initialize()
    {
        getMediaPlayer().play();
        getMediaPlayer().setVolume(1.0);
        mediaView.setMediaPlayer(getMediaPlayer());

    }

    public MediaPlayerModel(MediaView mediaView){
        this.mediaView=mediaView;
    }


}
