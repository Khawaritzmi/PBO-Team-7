package RuangDatar;

public class Lingkaran extends BangunDatar {
    double r;

    @Override
    public double luas() {
        double luas = 3.14 * r * r;
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = 2 * 3.14 * r * r;
        return keliling;
    }
}