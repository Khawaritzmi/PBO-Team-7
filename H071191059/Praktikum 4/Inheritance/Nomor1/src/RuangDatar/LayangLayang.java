package RuangDatar;

public class LayangLayang extends BangunDatar {
    double d1, d2;

    @Override
    public double luas() {
        double luas = (d1 * d2) / 2;
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = 2 * (d1 + d2);
        return keliling;
    }
}