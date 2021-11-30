package me.loule.celsiustofahrenheit.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {

    @FXML
    private Button buttonShowCelsiusToFahrenheit;

    @FXML
    private AnchorPane middleFrame;

    @FXML
    private VBox frameShowCelsiusToFahrenheit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        clearPageCentre();

        buttonShowCelsiusToFahrenheit.setOnMouseClicked(event -> {
            clearPageCentre();
            middleFrame.getChildren().addAll(frameShowCelsiusToFahrenheit);
        });
    }

    private void clearPageCentre() {
        middleFrame.getChildren().removeAll(frameShowCelsiusToFahrenheit);
    }
}