package RuangDatar;

public class Segitiga extends BangunDatar {
    double alas, tinggi, sisi1, sisi2;

    public double luas() {
        double luas = (alas * tinggi) / 2;
        return luas;
    }

    public double keliling() {
        double keliling = sisi1 + sisi2 + alas;
        return keliling;
    }
}