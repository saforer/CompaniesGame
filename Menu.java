import java.util.*;

class Menu {
	public String menuText = "";
	public List<MenuOption> heldOptions = new ArrayList<MenuOption>();
	
	public Menu() {	}
	
	public void Display() {
		System.out.println(menuText);
		
		for (MenuOption option : heldOptions) {
			System.out.println(option.optionText);
		}
	}
}

class MainMenu extends Menu {
	public MainMenu() {
		menuText = "This is the MainGame menu, isn't that great!?";
		heldOptions.add(new Quit(0));
		heldOptions.add(new StartNewGame(1));
	}
}

class GameMenu extends Menu {
	public GameMenu () {
		Company playerCompany = Main.currentGame.playerCompany;
		Individual player = Main.currentGame.playerCompany.leader;
		String companyText = playerCompany.name;
		String playerText = player.fName + " " +  player.MI + " " + player.lName;
		if (Main.currentGame.justStarted) {
			menuText = "You are " + playerText + " of the company " + companyText + " and have been given $100,000 as part of your initiation into a shadowy organization known as TOFAC, or The Organization, Federation, and Association Cooperative. You must be the first company standing to reach fifty million dollars, or the last company standing.";
			Main.currentGame.justStarted = false;
		}
		
		heldOptions.add(new Quit(0));
		heldOptions.add(new Hire(1));
		heldOptions.add(new OpenViewCompanies(2));
	}
}

class ViewCompanies extends Menu {
	public ViewCompanies() {
		for (Company company : Main.currentGame.companyList) {
			menuText += company.toString();
			if (company.employeeList.size() > 0) {
				for (Individual individual : company.employeeList) {
					menuText += individual.toString();
				}
				menuText += "-------------------------------------------\n";
			}
		}
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenGameMenu(1));
	}
}