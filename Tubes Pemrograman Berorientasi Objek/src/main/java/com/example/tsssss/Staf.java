package com.example.tsssss;
import java.time.LocalDate;

public class Staf extends Pengguna implements Absen {
    private boolean sudahAbsen;
    private String status;

    @Override
    public void isiAbsen(String nama, String id, String status) {
        this.nama = nama;
        this.id = id;
        this.status = status;
        this.sudahAbsen = true;
        System.out.println("Absen staf berhasil diisi.");
    }

    @Override
    public String TampilkanDetailKehadiran() {
        if (sudahAbsen) {
            LocalDate tanggal = LocalDate.now();
            return "Detail Kehadiran Staf:\n \n" +
                    "Nama : " + this.nama + "\n" +
                    "ID : " + this.id + "\n" +
                    "Status Kehadiran : " + this.status + "\n" +
                    "Tanggal : " + tanggal;
        } else {
            return "Staf belum melakukan absensi.";
        }
    }
}

