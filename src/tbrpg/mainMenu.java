package tbrpg;

import java.util.Scanner;

public class mainMenu {
    
    private static Scanner mainMenuInput = new Scanner(System.in);
    
    public static void startMenu () {
        
        System.out.println("\nPlease type the number corresponding to your choice in the console and press \"Enter\":\n");
        
        System.out.println("1 - Start game");
        System.out.println("2 - Load game");
        System.out.println("3 - Exit game");
        
        System.out.println("_____________________________________________________________________________________\n");
        
        int userChoice = mainMenuInput.nextInt();
        
        switch (userChoice) {
            
            case 1:
                // method rungame
                System.out.print("\033[H\033[2J");
                System.out.println("\nWork in progress!\n");
                break;
            case 2:
                // method loadgame
                System.out.println("\nWork in progress!\n");
                break;
            case 3:
                quitGame();
                break;
        }
        
    }
    
    public static void quitGame () {
        
        System.out.println("\nAre you sure you want to quit the game?\n");
        System.out.println("1 - Yes, regretfully I want to stop playing this fabulous game!");
        System.out.println("2 - No, return me to the main menu so I can play on forever!");
        
        System.out.println("_____________________________________________________________________________________\n");
        
        int userChoice = mainMenuInput.nextInt();
               
        if (userChoice == 1) {
            System.out.println("\nThanks for playing!");
        } else {
            startMenu();
        }
        
    }
    
}
