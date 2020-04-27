package RuangDatar;

public class Jajargenjang extends BangunDatar {
    double sisi1, tinggi, sisi2, sisi3;

    @Override
    public double luas() {
        double luas = sisi1 * tinggi;
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = sisi1 + sisi2 + sisi2 + tinggi;
        return keliling;
    }
}