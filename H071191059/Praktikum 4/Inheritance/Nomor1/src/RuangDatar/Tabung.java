package RuangDatar;

public class Tabung extends BangunRuang {
    double r, tinggi;

    @Override
    public double volume() {
        double v = 3.14 * r * r * tinggi;
        return v;
    }

    @Override
    public double luasPermukaan() {
        double lp = 2 * 3.14 * r * (r + tinggi);
        return lp;
    }
}