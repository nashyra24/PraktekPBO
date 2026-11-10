package Jobsheet08;

public class SmartFridge extends Kulkas implements Audible {
    public int tipe;
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
    }
}