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
public class Balrog extends Demon{
    
    public Balrog (String newName,int newStrength, int newHitPoints)
    {
        super(newName, newStrength, newHitPoints);
    }
    
    public String getSpecies(){
        
       return "Human";
    }
    
    public int getDamage(){
        int result = super.getDamage();
        
        result = result + super.getDamage();  
           return result;
    }      
}
