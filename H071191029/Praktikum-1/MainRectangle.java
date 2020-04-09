import java.util.*;
class MainRectangle{
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        rec.height = ap.nextDouble();
        rec.width = ap.nextDouble();
        // rec.height = 15;
        // rec.width = 10;
        System.out.println("Luas = " + rec.getArea());        
    }
}