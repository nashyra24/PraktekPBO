public class Peminjam {
    private String idPeminjam;
    private String nama;

    public Peminjam(String idPeminjam, String nama) {
        this.idPeminjam = idPeminjam;
        this.nama = nama;
    }

    public String getIdPeminjam() {
        return idPeminjam;
    }

    public String getNama() {
        return nama;
    }

    public String getInfo() {
        return idPeminjam + " - " + nama;
    }
}