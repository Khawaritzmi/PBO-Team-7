package RuangDatar;

public class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4, tinggi;

    double luas() {
        double luas = ((sisi1 + sisi3) * tinggi) / 2;
        return luas;
    }

    @Override
    double keliling() {
        double keliling = sisi1 + sisi2 + sisi3 + sisi4;
        return keliling;
    }
}