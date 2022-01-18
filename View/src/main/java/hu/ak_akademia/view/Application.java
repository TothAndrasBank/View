package hu.ak_akademia.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("login_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("EMK!🧤");
        stage.setScene(scene);
        stage.getIcons().add(new Image("icon.png"));



        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}