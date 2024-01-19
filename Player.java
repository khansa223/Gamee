/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author Khansa
 */
public class Player {
         
    
    // definisi atribut
    String name; 
    int speed;
    int healthPoin;
    int damage ;
    int armor ;
    
    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }
    
    void attack(){
        System.out.println(name +" is attacking...");
        System.out.println("Damage: "+ damage);
    }
    
    void defense(){
        System.out.println(name +" is defensive...");
        System.out.println("armor: "+ armor);
    }
    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
}
    


