package RuangDatar;

public class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    @Override
    public double volume() {
        double v = panjang * lebar * tinggi;
        return v;
    }

    @Override
    public double luasPermukaan() {
        double lp = 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi);
        return lp;
    }
}