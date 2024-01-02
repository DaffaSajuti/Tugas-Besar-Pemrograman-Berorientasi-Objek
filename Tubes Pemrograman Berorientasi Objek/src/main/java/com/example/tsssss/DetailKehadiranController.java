package com.example.tsssss;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DetailKehadiranController {

    @FXML
    private Label labelDetailKehadiran;

    public void setDetailKehadiran(String detail) {
        labelDetailKehadiran.setText(detail);
    }

}

