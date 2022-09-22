package com.company.freightroutingnn;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println(username.getText());
        System.out.println(password.getText());
    }
}