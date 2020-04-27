package Encapsulation;

import java.util.Scanner;

class MainP {
    public static void main(String[] args) {
        Player player1 = new Player("Xav", "Blue");
        Player p2 = new Player("Ren", "Red");
        Scanner sc = new Scanner(System.in);
        int p;
        boolean turn = true;
        System.out.println(">>>>> START GAME <<<<<<");
        while (true) {
            if (turn) {
                System.out.println(player1.getName() + "'s turn");
                System.out.println("1. Attack\n" + "2. Healing\n" + "3. Buy\n" + "4. Show Status\n" + "5. Show Items\n"
                        + "6. Sell\n" + "7. Use");
                System.out.println();
                p = sc.nextInt();
                if (p == 1) {
                    turn = false;
                    player1.attack(p2);
                    if (player1.dead(p2)) {
                        System.out.println(">>>>> END GAME <<<<<");
                        return;
                    }
                } else if (p == 2) {
                    player1.healing(player1);
                } else if (p == 3) {
                    turn = false;
                    player1.buy();
                } else if (p == 4) {
                    player1.showStatus();
                } else if (p == 5) {
                    player1.showItems();
                } else if (p == 6) {
                    player1.sell(player1);
                } else if (p == 7) {
                    player1.use();
                } else {
                    System.out.println("INVALID INPUT");
                }
            } else {
                System.out.println(p2.getName() + "'s turn");
                System.out.println("1. Attack\n" + "2. Healing\n" + "3. Buy\n" + "4. Show Status\n" + "5. Show Items\n"
                        + "6. Sell\n" + "7. Use");
                System.out.println();
                p = sc.nextInt();
                if (p == 1) {
                    turn = true;
                    p2.attack(player1);
                    if (p2.dead(player1)) {
                        System.out.println(">>>>> END GAME <<<<<");
                        return;
                    }
                } else if (p == 2) {
                    p2.healing(p2);
                } else if (p == 3) {
                    turn = true;
                    p2.buy();
                } else if (p == 4) {
                    p2.showStatus();
                } else if (p == 5) {
                    p2.showItems();
                } else if (p == 6) {
                    p2.sell(p2);
                } else if (p == 7) {
                    p2.use();
                } else {
                    System.out.println("INVALID INPUT");
                }
            }
        }
    }
}