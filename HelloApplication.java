package com.example.snackandladder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        try {
            Object root = FXMLLoader.load(getClass().getResource("startScreen.fxml")); //root node of scene
            Scene scene = new Scene(root, 560, 750);
            stage.setTitle("Snakes and Ladder Board Game");
            stage.setScene(scene);
            stage.show();

            Board game = new Board();
            player1 = new Player(pc, "blue");
            player2 = new Player(pc, "green");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}