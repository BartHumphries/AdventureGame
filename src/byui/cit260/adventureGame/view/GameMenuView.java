/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import java.util.Scanner;



/**
 *
 * @author vladbalashov
 */
public class GameMenuView {
    
    private String menu;
    
    public GameMenuView(){
        
        this.menu = "\n"
                  + "\n---------------------------------"
                  + "\n| Game Menu"
                  + "\n---------------------------------"
                  + "\nC - Choose character"
                  + "\nL - Choose location"
                  + "\nA - Calculate ability to win"
                  + "\nQ - Quit"
                  + "\n---------------------------------";
        
    }
    
    void displayMenu() {
        
        boolean done = false; // set flag to not done
        
        System.out.println(menu);
        do {
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
            System.out.println("\n Please enter the value. Must be C, A, L or Q");
            
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "C": // create and start a new game
                this.chooseCharacter();
                break;
            case "L":
                this.chooseLocation();
                break;

            case "A":
                this.displayCalcAbilityToWinView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }

    private void chooseCharacter() {
         System.out.println("\n*** chooseCharacter() function called ***");
    }

    private void chooseLocation() {
        System.out.println("\n*** chooseLocation() function called ***");
    }


    private void displayCalcAbilityToWinView() {
        CalcAbilityToWinView calcAbilityToWinView = new CalcAbilityToWinView();
                
        // Display the main menu view
        calcAbilityToWinView.displayCalcAbilityToWinView();
    }
    
 
}
