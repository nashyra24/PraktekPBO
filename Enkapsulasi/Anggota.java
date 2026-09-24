package Enkapsulasi;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private long limitPinjaman;
    private long jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, long limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public long getLimitPinjaman() {
        return limitPinjaman;
    }

    public long getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Menambah pinjaman, tidak boleh melebihi limit
    public void pinjam(long nominal) {
        if (jumlahPinjaman + nominal > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    // Mengangsur pinjaman, minimal 10% dari jumlah pinjaman saat ini
    public void angsur(long nominal) {
        double minimalAngsuran = 0.1 * jumlahPinjaman;
        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= nominal;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}