import java.util.ArrayList;

public class TransaksiPeminjaman {
    private String idTransaksi;
    private String tanggalPinjam;
    private Peminjam peminjam; // Relasi Asosiasi
    private ArrayList<Barang> daftarBarang; // Atribut ArrayList of Objects

    public TransaksiPeminjaman(String idTransaksi, String tanggalPinjam, Peminjam peminjam) {
        this.idTransaksi = idTransaksi;
        this.tanggalPinjam = tanggalPinjam;
        this.peminjam = peminjam;
        this.daftarBarang = new ArrayList<>();
    }

    public boolean tambahBarang(Barang barang, int jumlah) {
        if (barang.kurangiStok(jumlah)) {
            daftarBarang.add(barang);
            System.out.println("Berhasil menambahkan " + barang.getNamaBarang() + " sebanyak " + jumlah);
            return true;
        } else {
            System.out.println("Gagal! Stok " + barang.getNamaBarang() + " tidak mencukupi.");
            return false;
        }
    }

    public void cetakStruk() {
        System.out.println("\n========== STRUK PEMINJAMAN BARANG ==========");
        System.out.println("ID Transaksi   : " + idTransaksi);
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
        System.out.println("Peminjam       : " + peminjam.getInfo());
        System.out.println("----------------------------------------------");
        System.out.println("Daftar Barang Dipinjam:");
        for (int i = 0; i < daftarBarang.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + daftarBarang.get(i).getNamaBarang());
        }
        System.out.println("==============================================");
    }
}