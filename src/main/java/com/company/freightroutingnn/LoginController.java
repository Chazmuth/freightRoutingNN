package com.company.freightroutingnn;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button signUp;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println(username.getText());
        System.out.println(password.getText());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        signUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SceneHandler.changeScene(actionEvent, "signup.fxml", "Sign Up", 400, 600);
            }
        });
    }
}