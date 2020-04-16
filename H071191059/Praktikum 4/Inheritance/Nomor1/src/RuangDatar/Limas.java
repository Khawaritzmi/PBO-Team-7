package RuangDatar;

public class Limas extends BangunRuang {
    double luasAlas, jumlahLuasSisi, tinggi;

    @Override
    public double volume() {
        double v = (luasAlas * tinggi) / 3;
        return v;
    }

    @Override
    public double luasPermukaan() {
        double lp = luasAlas + jumlahLuasSisi;
        return lp;
    }
}