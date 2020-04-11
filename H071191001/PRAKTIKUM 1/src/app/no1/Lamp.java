package app.no1;

public class Lamp{

    private Boolean blueisOn = false;
    private Boolean redisOn = false;

    public void turnOn(){
        if (!blueisOn && !redisOn) {
            blueisOn = true;
            redisOn = false;
        } else if (redisOn) {
            redisOn = false;
            blueisOn = true;
        } else if (blueisOn) {
            blueisOn = false;
            redisOn = true;
        }
    }

    public void turnOff() {
        blueisOn = false;
        redisOn = false;
    }

    public void getState() {
        if (!blueisOn && !redisOn) {
            System.out.println("tidak ada lampu yang menyala");
        }else if (redisOn) {
            System.out.println("lampu biru = Off \nlampu merah = on");
        }else if (blueisOn){
            System.out.println("lampu biru = on \nlampu merah = off");
        }
    }

}

class Main{
    public static void main(String[] args) {
        Lamp lampu = new Lamp();
        lampu.turnOn();
        lampu.getState();
        lampu.turnOn();
        lampu.getState();
        lampu.turnOff();
        lampu.getState();   
    }
}