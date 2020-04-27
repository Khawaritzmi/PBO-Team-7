package RuangDatar;

public class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    public double luas() {
        double luas = panjang * lebar;
        return luas;
    }

    public double keliling() {
        double keliling = 2 * (panjang + lebar);
        return keliling;
    }
}