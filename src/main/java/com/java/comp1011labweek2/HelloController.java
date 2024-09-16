package com.java.comp1011labweek2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField rating;

    @FXML
    private TextField releaseYear;

    @FXML
    private Text result;

    @FXML
    private TextField title;

    @FXML
    void createGame(ActionEvent event) {
        try{
            VideoGame game = new VideoGame(Integer.parseInt(releaseYear.getText()), Integer.parseInt(rating.getText()), title.getText());

            result.setText(game.toString());
        }
        catch (Exception e)
        {
            result.setText(e.getMessage());
        }

        result.setVisible(true);
    }

    @FXML
    void initialize() {
        assert rating != null : "fx:id=\"rating\" was not injected: check your FXML file 'Untitled'.";
        assert releaseYear != null : "fx:id=\"releaseYear\" was not injected: check your FXML file 'Untitled'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'Untitled'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Untitled'.";
    }
}