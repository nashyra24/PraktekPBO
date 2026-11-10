package Jobsheet08;

public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;
    @Override
    public void naikkanVolume() {
        volume += 1;
    }
    @Override
    public void turunkanVolume() {
        volume -= 1;
    }
    public void getInfo() {
    System.out.println("Merk  : " + merk);
    System.out.println("Harga : " + harga);
    System.out.println("Warna : " + warna);
    }
}
