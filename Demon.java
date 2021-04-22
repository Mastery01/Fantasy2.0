/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasygame2.pkg0;
import java.util.Random;
/**
 *
 * @author amanda
 */
public class Demon extends Creature {
    
    public Demon(String newName,int newStrength, int newHitPoints)
    {
    
        super(newName, newStrength, newHitPoints);
    }
    
    public String getSpecies(){
        
       return "Human";
    }
    
    public int getDamage(){
        int result = super.getDamage();
        
        Random gen = new Random();
        
        if (gen.nextInt(100)<5)
        {
          result = result + 50;   
        }
            return result;
    }
    
}
