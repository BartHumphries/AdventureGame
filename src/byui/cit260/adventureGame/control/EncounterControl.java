/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.control;

/**
 *
 * @author Jack
 */
public class EncounterControl {

public String attackEnemy(int attackPhysical, int defensePhysical, 
         int attackMagical, int defenseMagical, int health){
   return "This is the return statement from attackEnemy()\n";      
}
public String usePotion(String name, int amount) {
   return "This is the return statement from usePotion()\n";      
}
public String getReward(String weapon, String potion, String ingredients) {
   return "This is the return statement from getReward()\n";      
}
public String addToCharacter(String item, int amount) {
   return "This is the return statement from addToCharacter()\n";      
}
}
