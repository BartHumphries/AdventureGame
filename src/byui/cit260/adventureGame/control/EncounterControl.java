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
public double calcAbilityToWin(double attackPhysical1, double attackMagical1,
        double defensePhysical1, double defenseMagical1, double attackPhysical2, double attackMagical2,
        double defensePhysical2, double defenseMagical2, double health1, double health2 ) {
    
    if (attackPhysical1<0 || attackMagical1<0 || defensePhysical1<0 || defenseMagical1<0
    || attackPhysical2<0 || attackMagical2<0 || defensePhysical2<0 || defenseMagical2<0) {
        return -1000000;
    }
    if (health1<=0 || health1>10000 || health2<=0 || health2>10000) {
        return -1000000;
    }
    
    double attack1 = attackPhysical1 + attackMagical1;
    double defense1 = defensePhysical1 + defenseMagical1;
    double attack2 = attackPhysical2 + attackMagical2;
    double defense2 = defensePhysical2 + defenseMagical2;
    double check1 = attack1 - defense2;
    double check2 = attack2 - defense1;
    
    if (check1 == 0 && check2 == 0) {
        double level = 0;
        return level;
    }

    if (check1==0 && check2>0){
        double level = 0 - health1/check2;
        return level;
    }

    if (check1==0 && check2<0){
        double level = 0;
        return level;
    }

    if (check2==0 && check1>0) {
        double level = health2/check1;
        return level;
    }

    if (check2==0 && check1<0) {
        double level = 0;
        return level;
    }

    double level = health2/check1 - health1/check2;
    return level;
   
}
}
