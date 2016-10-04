/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import SheepEnterprise.AdventureGame.model.Character;

/**
 *
 * @author Bart
 */
public class AdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Character playerOne = new Character();
        playerOne.setName("Fred Flinstone");
        // where something could die
        playerOne.setLevel(7);
        
        String playerInfo = playerOne.toString()
                System.out.println(playerInfo);
    }
    
}
