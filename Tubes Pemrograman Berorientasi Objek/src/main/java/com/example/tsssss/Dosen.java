package com.example.tsssss;
import java.time.LocalDate;

public class Dosen extends Pengguna implements Absen {
    private String mataKuliah;
    private boolean sudahAbsen;
    private String status;

    public void Dosen(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }

    // implementasi dari interface Absen
    @Override
    public void isiAbsen(String nama, String id, String status) {
        this.nama = nama;
        this.id = id;
        this.status = status; // tambahan status kehadiran
        this.sudahAbsen = true;
        System.out.println("Absen dosen berhasil diisi.");
    }

    @Override
    public String TampilkanDetailKehadiran() {
        if (sudahAbsen) {
            LocalDate tanggal = LocalDate.now();
            return "Detail Kehadiran Dosen :\n \n" +
                    "Nama : " + this.nama + "\n" +
                    "NIP  : " + this.id + "\n" +
                    "Mata Kuliah Yang Di Ajarkan  : " + this.mataKuliah + "\n" +
                    "Status Kehadiran : " + this.status + "\n" +
                    "Tanggal : " + tanggal;
        } else {
            return "Dosen belum melakukan absensi.";
        }
    }
}
