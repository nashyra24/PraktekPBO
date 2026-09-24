public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int stok;

    public Barang(String kodeBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public boolean kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            return true;
        }
        return false;
    }

    public String getInfo() {
        return "[" + kodeBarang + "] " + namaBarang + " (Sisa Stok: " + stok + ")";
    }
}