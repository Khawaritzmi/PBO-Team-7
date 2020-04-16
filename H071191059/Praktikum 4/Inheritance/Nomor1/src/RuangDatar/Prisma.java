package RuangDatar;

public class Prisma extends BangunRuang {
    double alas, tinggi, s;

    @Override
    public double volume() {
        double v = alas * tinggi;
        return v;
    }

    @Override
    public double luasPermukaan() {
        double lp = (2 * alas) + (s * tinggi);
        return lp;
    }
}