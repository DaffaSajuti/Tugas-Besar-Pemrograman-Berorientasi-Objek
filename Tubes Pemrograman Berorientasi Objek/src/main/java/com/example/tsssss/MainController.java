package com.example.tsssss;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button showMahasiswaInput;

    @FXML
    private Button showDosenInput;

    @FXML
    private Button showStafInput;
    @FXML
    private void showMahasiswaInput(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mahasiswa-view.fxml"));
            Parent root = loader.load();
            MahasiswaController controller = loader.getController();

            // Mendapatkan Stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showDosenInput(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Dosen-view.fxml"));
            Parent root = loader.load();
            DosenController controller = loader.getController();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showStafInput(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Staf-view.fxml"));
            Parent root = loader.load();
            StafController controller = loader.getController();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
