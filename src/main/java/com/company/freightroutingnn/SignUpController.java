package com.company.freightroutingnn;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private TextField emailAddress;

    @FXML
    private TextField password;

    @FXML
    private Button signUp;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        signUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SceneHandler.changeScene(actionEvent, "login-view.fxml", "Login", 320, 240);
            }
        });
    }
}
