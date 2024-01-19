
package game;


public class Game {

    
    public static void main(String[] args) {
        
        Player Hero = new Player();
        
        Hero.name = "Kirito";
        Hero.speed = 20;
        Hero.healthPoin = 1;
        Hero.damage = 25;
        Hero.armor = 10;
        
        Hero.run();
        Hero.attack();
        Hero.defense();
        
        if(Hero.isDead()){
            System.out.println("Game over");
        }
                
}
    
}
