/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasygame2.pkg0;

/**
 *
 * @author amanda
 */
public class Cyberdemon extends Demon {
    
    public Cyberdemon(String newName,int newStrength, int newHitPoints)
    {
    
      super(newName, newStrength, newHitPoints);
    }
    
    public String getSpecies(){
        
       return "Human";
    }
    
}
