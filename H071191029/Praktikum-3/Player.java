package nis2;

import java.util.ArrayList;

class Player {

    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private ArrayList<Item> items = new ArrayList<>();

    public Player(String name, String role, int level, double damage) {
        this.name = name;
        this.role = role;
        this.level = level;
        this.level = level;
        this.damage = damage;

        hp = 100;
        energy = 100;
        money = 50000;

    }

    public void showStatus() {
        System.out.println("\nName    = " + name);
        System.out.println("Role    = " + role);
        System.out.println("Level   = " + level);
        System.out.println("Damage  = " + damage);
        System.out.println("Hp      = " + hp);
        System.out.println("Energy  = " + energy);
        System.out.println("Money   = " + money);

    }

    public void showItems() {

        for (Item item : items) {

            System.out.println("Item name   = " + item.getName());
            System.out.println("Item price  = " + item.getPrice());
            System.out.println("Item info   = " + item.getInfo());
        }

    }

    public void attack(Player player) {

        if (player.hp <= 0 && player.energy <= 0) {
            System.out.println("---");
        } else {

            player.hp = player.hp - damage;
            energy -= 20;
        }
    }

    public void getDamage(Player player) {

        System.out.println(name + " has been damaged " + damage + " by " + player.name);
    }

    public void healing(double health) {

        hp += health;
        System.out.println(name + " was healed " + health + " %\n");
    }

    public void buy(Item item) {
        if (money >= item.getPrice()) {
            money -= item.getPrice();
            System.out.println("***" + item.getName().toUpperCase() + " purchased***");
        } else {
            System.out.println("!!!Can't afford " + item.getName().toUpperCase()+ "!!!");
        }

    }

    public void use(Item item) {

        if (item.getName().equals("Magic Potion") && money >= item.getPrice()){
            energy += 50;
            items.add(item);
        } else if (item.getName().equals("Smurfberry") && money >= item.getPrice() ) {
            hp += 50;
            items.add(item);

        } else if (item.getName().equals("Diamonds") &&  money >= item.getPrice()) {
            items.add(item);
        }

    }

    public void sell(Item item) {

        money += item.getPrice();
        System.out.println("\n" + item.getName() + " was sold for $SD" + item.getPrice() );

    }

    public void destroy(Item item) {

        items.remove(item);
        System.out.println("\n" + item.getName() + " has been destroyed");
        
    }

    boolean dead(Player enemy) {
        
        if(enemy.hp <= 0) {
            enemy.hp = 0;
            System.out.println(enemy.name + " mati");
            return true;
        }
        return false;

    }

}