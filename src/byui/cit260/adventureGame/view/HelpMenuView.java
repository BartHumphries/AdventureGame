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
public class HelpMenuView {
    
    private String menu;
    
    public HelpMenuView (){
        this.menu = "\n"
                  + "\n---------------------------------"
                  + "\n| Help Menu"
                  + "\n---------------------------------"
                  + "\nG - What is the goal of the game"
                  + "\nM - How to move"
                  + "\nW - How to win"
                  + "\nQ - Quit"
                  + "\n---------------------------------";
    }
    
    void displayHelpMenuView(){
        
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
            System.out.println("\n Please enter the value. Must be G, M, W or Q");
            
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
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G": // goal of the game
                System.out.println("\n****************************************"
                                 + "\n*-----------Goal of the Game-----------*"
                                 + "\n* The main goal of this game is to help*"
                                 + "\n* people of the land and win all       *"
                                 + "\n* monsters. Also to obtain love        *"
                                 + "\n*--------------------------------------*"
                                 + "\n****************************************");
                break;
            case "M":
                System.out.println("\n****************************************"
                                 + "\n*-------------How to Move--------------*"
                                 + "\n* This part is under construction      *"
                                 + "\n*                                      *"
                                 + "\n*                                      *"
                                 + "\n*--------------------------------------*"
                                 + "\n****************************************");
                break;
            case "W":
                System.out.println("\n****************************************"
                                 + "\n*--------------How to Win--------------*"
                                 + "\n* This part is under construction      *"
                                 + "\n*                                      *"
                                 + "\n*                                      *"
                                 + "\n*--------------------------------------*"
                                 + "\n****************************************");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return true;
        
    }
}
