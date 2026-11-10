package Jobsheet07.TUGAS;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Instansiasi Objek Subclass 1 (pakai constructor berparameter)
        Dosen dosen1 = new Dosen("19920310", "Dr. Ahmad Fauzi, M.Kom.", 5000000, "0010039201");
        
        // Instansiasi Objek Subclass 2 (pakai constructor tanpa parameter terus diisi nilainya)
        Dosen dosen2 = new Dosen();
        dosen2.nip = "19880115";
        dosen2.nama = "Siti Aminah, M.T.";
        dosen2.gaji = 4500000;
        dosen2.nidn = "0015018802";

        // Cetak informasi objek 1
        System.out.println("=== INFORMASI DOSEN 1 ===");
        System.out.println(dosen1.getInfo());

        // Cetak informasi objek 2
        System.out.println("=== INFORMASI DOSEN 2 ===");
        System.out.println(dosen2.getInfo());
    }
}