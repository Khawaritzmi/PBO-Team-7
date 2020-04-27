package RuangDatar;

public class Kerucut extends BangunRuang {
    double r, s, tinggi;

    @Override
    public double volume() {
        double v = (3.14 * r * r * tinggi) / 3;
        return v;
    }

    @Override
    public double luasPermukaan() {
        double lp = 3.14 * r * (r + s);
        return lp;
    }
}