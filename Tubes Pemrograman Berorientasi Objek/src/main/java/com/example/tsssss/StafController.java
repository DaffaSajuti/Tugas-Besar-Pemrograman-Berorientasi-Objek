package com.example.tsssss;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class StafController {

    @FXML
    private TextField namaStaf;
    @FXML
    private TextField idStaf;
    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private void submitStaf(ActionEvent event) throws IOException {
        String nama = namaStaf.getText();
        String id = idStaf.getText();
        String status = statusComboBox.getValue();

        Staf staf = new Staf();
        staf.isiAbsen(nama, id, status);
        showAlert("Absen Staf", "Absen berhasil disimpan.");
        String detailKehadiranStaf = staf.TampilkanDetailKehadiran();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailKehadiran-view.fxml"));
        Parent root = loader.load();
        DetailKehadiranController detailController = loader.getController();
        detailController.setDetailKehadiran(detailKehadiranStaf);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));

    }

    @FXML
    private void kembaliMenuUtama(ActionEvent event) {
        // Logika untuk kembali ke menu utama
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("start-view.fxml"));
            Parent root = loader.load();

            // Menampilkan kembali tampilan menu utama (MainController)
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
