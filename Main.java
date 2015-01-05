/*Factions Attempt 3 with a menu class and options class*/

import java.util.*;

class Main {
	public static List<Company> companyList = new ArrayList<Company>();
	public static List<String> usedCompName = new ArrayList<String>();
	public static List<String> usedSSN = new ArrayList<String>();
	public static boolean running = true;
	public static Menu currentMenu;
	
	
	public static void main (String[] args) {
		currentMenu = new MainMenu();
		
		while (running) {
			currentMenu.Display();
			
			Scanner scanner = new Scanner(System.in);
			int selection = 0;
			
			try{
				selection = scanner.nextInt(); 
				currentMenu.heldOptions.get(selection).Do();
			} catch (Exception err) {
				System.out.println("Please enter a valid option");
			}
		}
	}
}