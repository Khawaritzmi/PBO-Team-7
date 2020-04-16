package RuangDatar;

public class Kubus extends BangunRuang {
    double s;

    @Override
    public double volume() {
        double v = s * s * s;
        return v;
    }

    @Override
    public double luasPermukaan() {
        double lp = 6 * (s * s);
        return lp;
    }
}