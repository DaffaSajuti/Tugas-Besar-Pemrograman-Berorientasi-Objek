package com.example.tsssss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("start-view.fxml"));
        Parent root = fxmlLoader.load();

        MainController controller = fxmlLoader.getController(); // Mengambil controller

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Presensi Kehadiran Universitas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
