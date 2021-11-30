package me.loule.celsiustofahrenheit.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class CelsiusToFahrenheitController implements Initializable {

    @FXML
    private TextField textFieldCelsius;

    @FXML
    private TextField textFieldFahrenheit;

    @FXML
    private Slider sliderCelsius;

    @FXML
    private Slider sliderFahrenheit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textFieldCelsius.setOnKeyReleased(event -> {
            int celsius = Integer.parseInt(textFieldCelsius.getText());
            int fahrenheit = (int) (celsius * 1.8 + 32);
            textFieldFahrenheit.setText(String.valueOf(fahrenheit));
            sliderFahrenheit.setValue(fahrenheit);
            sliderCelsius.setValue(celsius);
        });

        textFieldFahrenheit.setOnKeyReleased(event -> {
            int fahrenheit = Integer.parseInt(textFieldFahrenheit.getText());
            int celsius = (int) ((fahrenheit - 32) / 1.8);
            textFieldCelsius.setText(String.valueOf(celsius));
            sliderCelsius.setValue(celsius);
            sliderFahrenheit.setValue(fahrenheit);
        });

        sliderCelsius.setOnMouseDragged(event -> {
            int celsius = (int) sliderCelsius.getValue();
            int fahrenheit = (int) (celsius * 1.8 + 32);
            textFieldCelsius.setText(String.valueOf(celsius));
            textFieldFahrenheit.setText(String.valueOf(fahrenheit));
            sliderFahrenheit.setValue(fahrenheit);
        });

        sliderFahrenheit.setOnMouseDragged(event -> {
            int fahrenheit = (int) sliderFahrenheit.getValue();
            int celsius = (int) ((fahrenheit - 32) / 1.8);
            textFieldCelsius.setText(String.valueOf(celsius));
            textFieldFahrenheit.setText(String.valueOf(fahrenheit));
            sliderCelsius.setValue(celsius);
        });
    }
}
