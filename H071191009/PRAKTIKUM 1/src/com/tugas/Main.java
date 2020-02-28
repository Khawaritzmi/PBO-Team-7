package com.tugas;

class Main {
    public static void main(String[] args) {
        Lampu lampu1 = new Lampu();
//jadi cara gunakannya kita mainkan turnOn dan turnOff nya dan kita bisa matikan dua duanya
        lampu1.turnOn();
        lampu1.turnOff();
        System.out.println(lampu1.getState());
    }
}