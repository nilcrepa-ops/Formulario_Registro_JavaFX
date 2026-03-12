package com.creus.login.login_register_creus.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * @author Nil
 */
public class SurpriseController {

    @FXML
    private Button btnSorpresa;
    
    @FXML
    private MediaView video;

    private MediaPlayer mediaPlayer;

    @FXML
    private void activarVideo(ActionEvent event) {
        String pathVideo = getClass().getResource("/img/segurata_vid.mp4").toExternalForm();
        
        Media media = new Media(pathVideo);
        mediaPlayer = new MediaPlayer(media);

        video.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
    }
}