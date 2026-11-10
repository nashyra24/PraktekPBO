package Jobsheet07.TUGAS;

public class Dosen extends Pegawai {
    public String nidn;

    // Constructor 1: Tanpa parameter (Overloading)
    public Dosen() {
        super(); // Memanggil constructor tanpa parameter parent
        this.nidn = "-";
    }

    // Constructor 2: Berparameter menggunakan super() 
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji); // Memanggil constructor berparameter parent
        this.nidn = nidn;
    }

    // Method Overriding dari parent class getInfo()
    @Override
    public String getInfo() {
        String info = super.getInfo(); // Memanggil getInfo() milik Pegawai
        info += "NIDN  : " + this.nidn + "\n";
        return info;
    }
}