/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasygame2.pkg0;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * Professor Bashias
 * Lab Project 5 Fantasy Game2.0
 * October 17,2020
 * this program acts as a game which allows you to add players and attack one 
 * another until one player is left. The program allows you to keep track of your 
 * health and damage. In the game you can choose between 4 different players to
 * play with.
 * @author amanda
 */
public class FantasyGame20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    String playerName = null;
    String Species ="";
    
    
    ArrayList <Creature> players = new ArrayList<Creature>();
    System.out.println("Welcome to the Fantasy Game\n");
    System.out.println("1. Add the game players");
    System.out.println("2. Players play in turn until only one is left\n");
    System.out.println("Good Luck!\n\n");
    System.out.println("First, let's add some players:");
    
    playerName = input.next();
    System.out.println("Enter player's name ('quit' when no more players):");
    
    while(!playerName.equalsIgnoreCase("quit")){
    System.out.println(playerName + ", which species are you?\n");
    System.out.println(" b/B: Balrog");
    System.out.println(" c/C: Cyberdemon");
    System.out.println(" e/E: Elf");
    System.out.println(" h/H: Human");
    
    String choose = input.next();
    if(choose.equalsIgnoreCase("b"))
        Species = "Balrog";
        else if(choose.equalsIgnoreCase("c")) {
         Species = "Cyberdemon";
        }
        else if(choose.equalsIgnoreCase("e")) {
         Species = "Elf";
        }
        else if(choose.equalsIgnoreCase("h")) {
         Species = "Human";
     }

     Creature creature = new Creature(playerName, (int)(1+ 50* Math.random()),
     (int)(1+50*Math.random()));
     players.add(creature);	
     
    System.out.println("Enter player's name ('quit' when no more players):\n");
    playerName= input.next();
    }//end while
    System.out.println("Current Players: \n");

   
    for(Creature c : players){
        //System.out.println("Current Players: \n");
        System.out.println("NAME | SPECIES | STRENGTH | HIT POINTS \n");
        System.out.println(c.getName() + " | " + 
    c.getSpecies() + " | " +
    c.getStrength() + " | " +
    c.getHitPoints()+"\n");
    }
    
    System.out.println("The Players are ready! \n");
    System.out.println("Let the Battle begin!\n");
    boolean playing = true;
    while(playing) {
	for(int i = 0; i< players.size(); i++) {
	   System.out.println(players.get(i).getName()+ " select one of the following");
	   System.out.println("a/A: Attack an opponent\r\n" + 
	   "p/P: Pass (go to the next player)\r\n" + "q/Q: Quit the game");
	   String choose = input.next();
	
           //Attack 
           if(choose.equalsIgnoreCase("a")) {
                System.out.println("Which player are you attacking");
                choose = input.next();
                Creature playerAttacked;
                
                for(Creature c: players) {
                    if(c.isNamed(choose)) {
                        playerAttacked = c;
                        System.out.println(playerAttacked);
                        playerAttacked.Damage(players.get(i).getDamage());
                        System.out.println("Damage generated" + players.get(i).getDamage());
                        }
                    }
                }
           else if (choose.equalsIgnoreCase("p")){
               i++;            
           }
//           if(players.get(i).isDead()) {
//             players.remove(i);
//            }
             System.out.println("Current Players:\r\n" + "NAME | SPECIES | STRENGTH | HIT POINTS");
            for(Creature c : players){
                //System.out.println(c);
                //System.out.println("NAME | SPECIES | STRENGTH | HIT POINTS \n");
                System.out.println(c.getName() + " | " + 
                c.getSpecies() + " | " +
                c.getStrength() + " | " +
                c.getHitPoints()+"\n");
            }
        }

        }
  }
    }