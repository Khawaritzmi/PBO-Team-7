package Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player {
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private List<Item> items;
    static Scanner sc = new Scanner(System.in);

    public Player(String name, String role) {
        items = new ArrayList<>();
        this.name = name;
        this.role = role;
        level = 1;
        damage = 10;
        hp = 95; // berkurang ketika di attck
        energy = 100; // berkurang ketika attack
        money = 1500;
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
        System.out.println("Name\t = " + name);
        System.out.println("Role\t = " + role);
        System.out.println("Level\t = " + level);
        System.out.println("Damage\t = " + damage);
        System.out.println("Hp\t = " + hp);
        System.out.println("Energy\t = " + energy);
        System.out.println("Money\t = " + money);
        System.out.println();
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("You have no item(s)");
        } else {
            for (int i = 0; i < items.size(); i++) {
                System.out.println("Item " + i);
                items.get(i).descItem();
            }
        }
    }

    public boolean dead(Player enemy) {
        if (enemy.hp <= 0 || enemy.energy <= 0) {
            System.out.println(enemy.name + " K.O");
            return true;
        }
        return false;
    }

    public void attack(Player player) {
        player.hp -= damage;
        energy -= 10;
    }

    public void buy() {
        System.out.println("ITEM 1\n" + "Amber Power\n" + "$290");
        System.out.println("=====================");
        System.out.println("ITEM 2\n" + "Violet Power\n" + "$190");
        System.out.println("=====================");
        System.out.println("ITEM 3\n" + "Black Power\n" + "$180");

        int p = sc.nextInt();

        if (p == 1) {
            System.out.println("Amber Power added to your item\n");
            items.add(new Item("Amber Power", 290, ""));
            money -= 290;
        } else if (p == 2) {
            System.out.println("Violet Power added to your item\n");
            items.add(new Item("Violet Power", 190, ""));
            money -= 190;
        } else if (p == 3) {
            System.out.println("Violet Power added to your item\n");
            items.add(new Item("Violet Power", 80, ""));
            money -= 80;
        } else {
            System.out.println("NONE");
            return;
        }
    }

    public void healing(Player player) {
        if (hp == 95 || energy == 100 || money == 1500) {
            System.out.println(player.name + " aren't allowed to heal");
        } else if (energy >= 10 && money >= 55) {
            hp += 15;
            money -= 45;
            System.out.println(player.name + " was successfully healing!");
            System.out.println();
        } else {
            System.out.println(player.name + " energy or money isn't enough!");
            return;
        }
    }

    public void sell(Player player) {
        if (items.isEmpty()) {
            System.out.println(player.name + " have no item(s) to sell");
        } else {
            showItems();
            System.out.println("Which item you want to sell? (input number of item)");
            int in = sc.nextInt();
            System.out.println(player.name + " get $" + items.get(in).getPrice());
            System.out.println();
            money += items.get(in).getPrice();
            items.remove(in);
        }
    }

    public void use() {
        if (items.isEmpty()) {
            System.out.println("There's no one item(s) to use");
        } else {
            showItems();
            System.out.println("Which item you want to use? (input number of item)");
            int in = sc.nextInt();
            Item item = items.get(in);
            System.out.println(item.getName() + " is used");
            items.remove(in);
        }
    }
}