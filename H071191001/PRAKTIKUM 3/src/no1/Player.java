package no1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private String role;
    private int level = 1;
    private double damage;
    private double hp = 100;
    private double energy = 100;
    private int money = 1000;
    private List <Item> items;  //untuk menyimpan anggota item
    
    //constructor memanggil name role dan damage
    public Player (String name, String role, double damage){
        this.name = name;
        this.role = role;
        this.damage = damage;
        items = new ArrayList<>(); 
    }
    
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getLevel() {
        return level;
    }
    public void showStatus() {
        System.out.println("name\t :" + name);
        System.out.println("role\t :" + role);
        System.out.println("level\t :" + level);
        System.out.println("damage\t :" + damage);
        System.out.println("HP\t :" + hp);
        System.out.println("energy\t :" + energy);
        System.out.println("uang\t :" + money);
    }

    public boolean lose(Player enemy){
        if (enemy.hp <= 0){
            System.out.println(enemy.name + " mati!");
            return true;
        } return false;
    }

    //memunculkan item
    public void showItems(){

        for (Item item : items) {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getInfo());
        }
        // for (int i = 0; i < items.size(); i++) {
        //     System.out.println(items.get(i));
        //     items.get(i);
        // }
    }

    public double getHp(){
        return hp;
    }

    public void attack(Player player){
        player.hp -= damage;
        energy -= 10;
        showStatus();
    }

    public void healing() {
        if (money >= 50) {
            energy += 10;
            money -= 50;
            showStatus();
        } else {
            System.out.println("kaya dikit dong cuy " + name);
        }
    }

    //menu buy
    public void buy(){
        System.out.println("1. armor = 100 = menggurangi damage ");
        System.out.println("2. sword = 200 = menambahkan attack ");
        System.out.println("3. bloodSword = 320 = menambahkan 100 attack ");
        System.out.println("4. PinkyArmor = 200 = menggurangi damage sampai 200");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        switch (n) {
            case 1:
                items.add(new Item("armor", 100, "mengurangi damage"));
                money -= 100;
                break;
            
            case 2:
                items.add(new Item("sword", 200, "menambah attack"));
                money -= 200;
                break;
                
            case 3:
                items.add(new Item("bloodSword", 320, "menambahkan 100 attack"));
                money -= 320;
                break;

            case 4:
                items.add(new Item("PinkyArmor", 200, "mengurangi damage sampai 200"));
                money -= 200;
                break;
        }
        
    }

}