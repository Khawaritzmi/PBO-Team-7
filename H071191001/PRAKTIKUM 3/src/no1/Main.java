package no1;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Player player1 = new Player("bila" , "pinkylove" , 30);
        Player player2 = new Player("nisrina" , "greeny" , 30);
        Item item1 = new Item("epic" ,20, "gjfjf");
        

        Scanner sc = new Scanner(System.in);
        boolean next = true;

        
        while (true) {
            if (next) {
                System.out.println("Next Player : " + player1.getName());
                System.out.println("1. attack");
                System.out.println("2. buy ");
                System.out.println("3. healing ");
                System.out.println("4. Show Status ");
                System.out.println("5. Show Items ");
                int n = sc.nextInt();
                if (n == 1) {
                    next = false;
                    player1.attack(player2);
                    if (player1.lose(player1)) {
                        return;
                    }
                } else if (n == 2){
                    next = false;
                    player1.buy();
                } else if (n == 3){
                    next = false;
                    player1.healing();
                } else if (n == 4){
                    player1.showStatus();
                } else if(n == 5){
                    player1.showItems();
                }

            } else {
                next = false;
                System.out.println("Next Player : " + player2.getName());
                System.out.println("1. attack");
                System.out.println("2. buy ");
                System.out.println("3. healing ");
                System.out.println("4. Show Status ");
                System.out.println("5. Show Items ");
                int n = sc.nextInt();
                if (n == 1) {
                    next = true;
                    player2.attack(player1);
                    if (player2.lose(player1)) {
                       return;
                    }

                } else if (n == 2) {
                    next = true;
                    player2.buy();
                } else if (n == 3) {
                    next = true;
                    player2.healing();
                } else if (n == 4) {
                    player2.showStatus();
                } else if (n == 5) {
                    player2.showItems();
                }
 

            }
        }
    }
}