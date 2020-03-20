package nis2;
/**
 * MainPlayer
 */
public class MainPlayer {

    public static void main(String[] args) {
        Player p1 = new Player("Grumpy", "Grumpy Smurf", 3, 22);
        Player p2 = new Player("Clumsy", "Clumsy Smurf", 5, 55);
        Item item1 = new Item("Magic Potion", 10000, "Increases energy");
        Item item2 = new Item("Smurfberry", 5000, "Increases health");
        Item item3 = new Item("Diamonds", 30000, "$$$ Money money money always shiney $$$");
        Item item4 = new Item("Bow and arrow", 15000, "Kills Gargamel");
        Item item5 = new Item("Excalibur", 30000, "Also kills Gargamel");

        while(true)
        {

            p1.attack(p2);
            if(p1.dead(p2)) 
            {
                p2.showStatus();
                break;
            }
            p1.getDamage(p2);
            p1.healing(20);
            p1.buy(item1);
            p1.use(item1);
            p1.sell(item4);
            p1.showStatus();
            p1.showItems();
            System.out.println("===========================================");
            p2.attack(p1);
            if(p2.dead(p1)) 
            {
                p1.showStatus();
                break;
            }
                
            p2.getDamage(p1);
            p2.healing(5);
            p2.buy(item2);
            p2.buy(item3);
        
            p2.use(item2);
            p2.use(item3);
         
            p2.destroy(item5);
            p2.showStatus();
            p2.showItems();
            
        }   
    }
}