/*Factions Attempt 3 with a menu class and options class*/

import java.util.*;

class Main {
	public static Game currentGame;
	
	
	public static void main (String[] args) {
		currentGame = new Game();
		currentGame.running = true;
		currentGame.currentMenu = new MainMenu();
		
		while (currentGame.running) {
			currentGame.currentMenu.Display();
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int selection = 0;
			
			try{
				selection = scanner.nextInt(); 
				currentGame.currentMenu.heldOptions.get(selection).Do();
			} catch (Exception err) {
				System.out.println("Please enter a valid option");
			}
		}
	}
}