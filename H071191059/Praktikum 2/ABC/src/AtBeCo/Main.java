package AtBeCo;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double heigth = input.nextDouble();
        double depth = input.nextDouble();
        double mass = input.nextDouble();

        Box box = new Box(width, heigth, depth);
        
        box.setMass(mass);
        System.out.println("Masa jenis = " + box.getDensity());
        box.setMass(mass*2);
        System.out.println("Masa jenis = " + box.getDensity());
    }
}