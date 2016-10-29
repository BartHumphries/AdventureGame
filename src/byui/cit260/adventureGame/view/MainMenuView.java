/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author vladbalashov
 */
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------"
                  + "\n| Main Menu"
                  + "\n---------------------------------"
                  + "\nN - Start New Game"
                  + "\nL - Load Game"
                  + "\nH - Help"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n---------------------------------";
}

    public void displayMainMenuView() {
        
        boolean done = false; //set flag to not done
        
       System.out.println(menu);
        do{
            //promt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            //do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the value. Must be N, L, H, S or Q");
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length()<1 ) { // value is incorrect
                System.out.println("\nPlease, enter the value. It can not be blank");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "L":
                this.loadGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame(AdventureGame.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void loadGame() {
        System.out.println("\n*** LoadGame function called ***");
    }

    private void displayHelpMenu() {
        // create main menu object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the main menu view
        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("\n*** SaveGame function called");
    }
    
}
