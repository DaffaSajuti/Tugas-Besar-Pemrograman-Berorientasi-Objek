package com.example.tsssss;
import java.time.LocalDate;

public class Mahasiswa extends Pengguna implements Absen {
    private String mataKuliah;
    private String kelas;
    private boolean sudahAbsen;
    private String status;

    public void mahasiswa(String mataKuliah, String kelas){
        this.mataKuliah = mataKuliah;
        this.kelas = kelas;
    }

    // implementasi dari interface Absen
    @Override
    public void isiAbsen(String nama, String id, String status) {
        this.nama = nama;
        this.id = id;
        this.status = status; // tambahan status kehadiran
        this.sudahAbsen = true;
        System.out.println("Absen mahasiswa berhasil diisi.");
    }

    @Override
    public String TampilkanDetailKehadiran() {
        if (sudahAbsen) {
            LocalDate tanggal = LocalDate.now();
            return "Detail Kehadiran Mahasiswa :\n \n" +
                    "Nama : " + this.nama + "\n" +
                    "NPM : " + this.id + "\n" +
                    "Mata Kuliah : " + this.mataKuliah + "\n" +
                    "Kelas : " + this.kelas + "\n" +
                    "Status Kehadiran : " + this.status + "\n" +
                    "Tanggal : " + tanggal;
        } else {
            return "Mahasiswa belum melakukan absensi.";
        }
    }

}
