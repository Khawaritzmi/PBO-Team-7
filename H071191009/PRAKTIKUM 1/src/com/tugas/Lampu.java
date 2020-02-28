package com.tugas;

class Lampu{
    boolean bluIsOn;
    boolean redIsOn;

    public void turnOn(){
        if(bluIsOn == redIsOn){
            bluIsOn = true;
            redIsOn = false;
        }else{
            bluIsOn = true;
            redIsOn = true;
        }
    }
    public void turnOff(){
        if (bluIsOn == redIsOn){
            bluIsOn = false;
            redIsOn = true;
        }else{
            bluIsOn = true;
            redIsOn = true;
        }
    }
    public String getState(){
        if (bluIsOn == true && redIsOn == false){
            return "Lampu Biru Menyala";
        }else if (bluIsOn == false && redIsOn == true){
            return "Lampu Merah Menyala";
        }else if(bluIsOn == true && redIsOn == true){
            return "Tidak boleh menyala dua dua";
        }else{
            return "TIDAK ADA LAMPU MENYALA";
        }
    }
}