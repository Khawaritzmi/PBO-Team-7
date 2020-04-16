package RuangDatar;

public class Persegi extends BangunDatar {
    double sisi;

    @Override
    double luas() {
        double luas = sisi * sisi;
        return luas;
    }

    @Override
    double keliling() {
        double keliling = 4 * sisi;
        return keliling;
    }
}