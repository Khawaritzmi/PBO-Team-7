package app.no2;

import java.util.Scanner;

class Box{

private double height;
private double widht;
private double depth;
private double mass;


public void setHeight(double height){
    this.height = height;
} 

public void setWidht(double widht){
    this.widht = widht;
}

public void setDepth(double depth){
    this.depth = depth;
}

Box(double height, double widht, double depth){
    setHeight(height);
    setWidht(widht);
    setDepth(depth);
}

public void setMass(double mass){
this.mass = mass;
}

public double getDensity(){
return  mass / (height * widht * depth);
}

}

class rBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        double depth = input.nextDouble();
        double mass = input.nextDouble();
        Box box = new Box(width, height, depth);
        box.setMass(mass);
        System.out.println("Massa jenis = " + box.getDensity());
        box.setMass(mass*2);
        System.out.println("Massa jenis = " + box.getDensity());
    }
    
}