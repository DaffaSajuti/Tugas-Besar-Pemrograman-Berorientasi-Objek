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

public class DosenController {

    @FXML
    private TextField namaDosen;
    @FXML
    private TextField nipDosen;
    @FXML
    private TextField mataKuliahDosen;
    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private void submitDosen(ActionEvent event) throws IOException {
        String nama = namaDosen.getText();
        String id = nipDosen.getText();
        String mataKuliah = mataKuliahDosen.getText();
        String status = statusComboBox.getValue();

        Dosen dosen = new Dosen();
        dosen.Dosen(mataKuliah);
        dosen.isiAbsen(nama, id, status);
        showAlert("Absen Dosen", "Absen berhasil disimpan.");
        String detailKehadiranDosen = dosen.TampilkanDetailKehadiran();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailKehadiran-view.fxml"));
        Parent root = loader.load();
        DetailKehadiranController detailController = loader.getController();
        detailController.setDetailKehadiran(detailKehadiranDosen);

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

    // memberikan peringatan jika
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}