package RuangDatar;

public class BelahKetupat extends BangunDatar {

    double sisi, d1, d2;

    @Override
    public double luas() {
        double luas = 4 * sisi;
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = (d1 * d2) / 2;
        return keliling;
    }
}