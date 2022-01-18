package hu.ak_akademia.view;

import hu.ak_akademia.view.exeption.FXMLLoadException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class LoginController {

    public AnchorPane rootPane;
    public Button loginButton;
    public Label forgotPasswordLabel;
    public TextField userNameTextField;
    public TextField passwordTextField;
    public Label errorLabel;

    @FXML
    protected void handleLoginButton() {

        AnchorPane content;
        try {
            content = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("landing_view.fxml")));
        } catch (IOException e) {
            throw new FXMLLoadException(e.getMessage());
        }
        rootPane.getChildren().setAll(content);

        //TODO Input validate

    }
}