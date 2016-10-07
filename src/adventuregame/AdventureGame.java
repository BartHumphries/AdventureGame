/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;
import byui.cit260.adventureGame.model.Character;
import byui.cit260.adventureGame.model.Game;
import byui.cit260.adventureGame.model.Map;
import byui.cit260.adventureGame.model.PartyComposition;

/**
 *
 * @author Jack
 */
public class AdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character playerOne = new Character();
        
        playerOne.setName("Bart");
        playerOne.setLevel(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        PartyComposition characterOne = new PartyComposition();
        
        characterOne.setCharacterName("Killer Stone");
        
        String partyCompositionInfo = characterOne.toString();
        System.out.println(partyCompositionInfo);
        
        Game gameOne = new Game();
        
        gameOne.setCurrentLocation("Fight Land");
        gameOne.setSaveSlot(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Map locationOne = new Map();
        
        locationOne.setLocationList("Miracle Land");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
    }
    
}
