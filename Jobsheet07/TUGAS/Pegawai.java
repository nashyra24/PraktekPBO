package Jobsheet07.TUGAS;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    // Constructor 1: Tanpa parameter (Overloading)
    public Pegawai() {
        this.nip = "-";
        this.nama = "-";
        this.gaji = 0.0;
    }

    // Constructor 2: Berparameter (Overloading)
    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    // Method info
    public String getInfo() {
        String info = "";
        info += "NIP   : " + this.nip + "\n";
        info += "Nama  : " + this.nama + "\n";
        info += "Gaji  : " + this.gaji + "\n";
        return info;
    }
}
