package RuangDatar;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas dan Keliling Bangun Datar");
        System.out.println("2. Mencari Volume dan Luas Permukaan Bangun Ruang");

        System.out.println("Input Nomor Menu");
        int menu = sc.nextInt();

        System.out.println();

        if (menu == 1) {
            System.out.println();
            System.out.println("***1. Bangun Datar ***");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Trapesium");
            System.out.println("6. Jajargenjang");
            System.out.println("7. Layang-layang");
            System.out.println("8. Belah Ketupat");

            System.out.println("Input angka bangun datar");
            int bd = sc.nextInt();
            if (bd == 1) {
                Persegi persegi = new Persegi();
                System.out.print("Input sisi = ");
                persegi.sisi = sc.nextDouble();
                System.out.println("Luas = " + persegi.luas());
                System.out.println("keliling = " + persegi.keliling());
            } else if (bd == 2) {
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                System.out.print("Input panjang = ");
                persegiPanjang.panjang = sc.nextDouble();
                System.out.print("Input lebar = ");
                persegiPanjang.lebar = sc.nextDouble();
                System.out.println("Luas = " + persegiPanjang.luas());
                System.out.println("Keliling = " + persegiPanjang.keliling());
            } else if (bd == 3) {
                Lingkaran lingkaran = new Lingkaran();
                System.out.print("Input jari-jari = ");
                lingkaran.r = sc.nextDouble();
                System.out.println("Luas = " + lingkaran.luas());
                System.out.println("keliling = " + lingkaran.keliling());
            } else if (bd == 4) {
                Segitiga segitiga = new Segitiga();
                System.out.print("Input alas = ");
                segitiga.alas = sc.nextDouble();
                System.out.print("Input tinggi = ");
                segitiga.tinggi = sc.nextDouble();
                System.out.print("Input sisi1 = ");
                segitiga.sisi1 = sc.nextDouble();
                System.out.print("Input sisi2 = ");
                segitiga.sisi2 = sc.nextDouble();
                System.out.println("luas = " + segitiga.luas());
                System.out.println("keliling = " + segitiga.keliling());
            } else if (bd == 5) {
                Trapesium trapesium = new Trapesium();
                System.out.print("Input sisi1 = ");
                trapesium.sisi1 = sc.nextDouble();
                System.out.print("Input sisi2 = ");
                trapesium.sisi2 = sc.nextDouble();
                System.out.print("Input sisi3 = ");
                trapesium.sisi3 = sc.nextDouble();
                System.out.print("Input tinggi = ");
                trapesium.tinggi = sc.nextDouble();
                System.out.println("luas = " + trapesium.luas());
                System.out.println("keliling = " + trapesium.keliling());
            } else if (bd == 6) {
                Jajargenjang jajarGenjang = new Jajargenjang();
                System.out.print("Input sisi1 = ");
                jajarGenjang.sisi1 = sc.nextDouble();
                System.out.print("Input tinggi = ");
                jajarGenjang.tinggi = sc.nextDouble();
                System.out.print("Input sisi2 = ");
                jajarGenjang.sisi2 = sc.nextDouble();
                System.out.print("Input sisi3 = ");
                jajarGenjang.sisi3 = sc.nextDouble();
                System.out.println("luas = " + jajarGenjang.luas());
                System.out.println("keliling = " + jajarGenjang.keliling());
            } else if (bd == 7) {
                LayangLayang layang = new LayangLayang();
                System.out.print("Input diagonal 1 = ");
                layang.d1 = sc.nextDouble();
                System.out.print("Input diagonal 2 = ");
                layang.d2 = sc.nextDouble();
                System.out.println("luas = " + layang.luas());
                System.out.println("keliling = " + layang.keliling());
            } else if (bd == 8) {
                BelahKetupat belahKetupat = new BelahKetupat();
                System.out.print("Input diagonal 1 = ");
                belahKetupat.d1 = sc.nextDouble();
                System.out.print("Input diagonal 1 = ");
                belahKetupat.d2 = sc.nextDouble();
                System.out.print("Input sisi = ");
                belahKetupat.sisi = sc.nextDouble();
                System.out.println("luas = " + belahKetupat.luas());
                System.out.println("keliling = " + belahKetupat.keliling());
            }
        } else if (menu == 2) {
            System.out.println("*** 2. Bangun Ruang ***");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Prisma");
            System.out.println("4. Bola");
            System.out.println("5. Tabung");
            System.out.println("6. Limas");
            System.out.println("7. Kerucut");

            System.out.println("Input angka bangun ruang");
            int br = sc.nextInt();
            if (br == 1) {
                Kubus kubus = new Kubus();
                System.out.println();
                System.out.print("Input sisi = ");
                kubus.s = sc.nextDouble();
                System.out.println("volume = " + kubus.volume());
                System.out.println("luas permukaan = " + kubus.luasPermukaan());
            } else if (br == 2) {
                Balok balok = new Balok();
                System.out.print("Input panjang  = ");
                balok.panjang = sc.nextDouble();
                System.out.print("Input lebar    = ");
                balok.lebar = sc.nextDouble();
                System.out.print("Input tinggi   = ");
                balok.tinggi = sc.nextDouble();
                System.out.println("volume = " + balok.volume());
                System.out.println("luas permukaan = " + balok.luasPermukaan());
            } else if (br == 3) {
                Prisma prisma = new Prisma();
                System.out.print("Input alas    = ");
                prisma.alas = sc.nextDouble();
                System.out.print("Input tinggi  = ");
                prisma.tinggi = sc.nextDouble();
                System.out.print("Input sisi    = ");
                prisma.s = sc.nextDouble();
                System.out.println("volume = " + prisma.volume());
                System.out.println("luas permukaan = " + prisma.luasPermukaan());
            } else if (br == 4) {
                Bola bola = new Bola();
                System.out.print("Input jari-jari = ");
                bola.r = sc.nextDouble();
                System.out.println("volume = " + bola.volume());
                System.out.println("luas permukaan = " + bola.luasPermukaan());
            } else if (br == 5) {
                Tabung tabung = new Tabung();
                System.out.print("Input jari-jari     = ");
                tabung.r = sc.nextDouble();
                System.out.print("Input tinggi tabung = ");
                tabung.tinggi = sc.nextDouble();
                System.out.println("volume = " + tabung.volume());
                System.out.println("luas permukaan = " + tabung.luasPermukaan());
            } else if (br == 6) {
                Limas limas = new Limas();
                System.out.print("Input luas alas = ");
                limas.luasAlas = sc.nextDouble();
                System.out.println("Input jumlah luas sisi = ");
                limas.jumlahLuasSisi = sc.nextDouble();
                System.out.println("Input tinggi = ");
                limas.tinggi = sc.nextDouble();
                System.out.println("volume = " + limas.volume());
                System.out.println("luas permukaan = " + limas.luasPermukaan());
            } else if (br == 7) {
                Kerucut kerucut = new Kerucut();
                System.out.print("Input jari-jari = ");
                kerucut.r = sc.nextDouble();
                System.out.print("Input selimut   = ");
                kerucut.s = sc.nextDouble();
                System.out.print("Input tinggi    = ");
                kerucut.tinggi = sc.nextDouble();
                System.out.println("volume = " + kerucut.volume());
                System.out.println("luas permukaan = " + kerucut.luasPermukaan());
            }
        } else {
            System.out.println("Salah input");
            return;
        }
    }
}