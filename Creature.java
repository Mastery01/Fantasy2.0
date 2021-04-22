/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasygame2.pkg0;
import java.util.Random;
/**
 *
 * Professor Bashias
 * Lab Project 5 Fantasy Game2.0
 * October 17,2020
 * @author amanda
 */
public class Creature {
 
    private int strength;
    private int hitPoints;
    private int damage;
    private String name;
    
    Creature(String newName, int newStrength, int newHit)
    throws IllegalArgumentException{
        name=newName;
        strength =newStrength;
        hitPoints = newHit;
    }
    
    public String getName(){
        return name;
    }
    
    public String getName(String name) {
		this.name = name;
		return this.name;
	}
    
   public String getSpecies(){
      return "Human";
    }
   
  void setStrength(int newStrength)throws IllegalArgumentException{
      if(newStrength<0){
      strength = newStrength;
      }
      else{
          throw new IllegalArgumentException();
          }
  }
  
  public int getStrength(){
     return strength;
  }
  
  void setHitPoints(int newHit)throws IllegalArgumentException{
      hitPoints = newHit;
  }
  
  public int getHitPoints(){
      return hitPoints;
  }

   void Damage(int damage) throws IllegalArgumentException{
    strength = strength-damage; 
 }
  
  public int getDamage(){
    Random gen = new Random();
    return 1 + gen.nextInt(hitPoints);
}
  
  public boolean isDead() {
		if (strength <=0) {
			return true;
		}
		return false;
	}


 boolean isNamed(String aName){
        if (name.equals(aName)){
            return true;
        }
        else{
            return false;
        }
 }
 
 public String toString(){
    return name + "|" + getSpecies() + "|" + strength + "|" +hitPoints;
 }
    
}
