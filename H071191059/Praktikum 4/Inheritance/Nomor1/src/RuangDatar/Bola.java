package RuangDatar;

public class Bola extends BangunRuang {
    double r;

    @Override
    public double volume() {
        double v = (4 * 3.14 * r) / 3;
        return v;
    }

    @Override
    public double luasPermukaan() {
        double lp = 4 * 3.14 * r * r;
        return lp;
    }
}