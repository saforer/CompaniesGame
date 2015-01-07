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
		menuText = "This is the main menu, isn't that great!?";
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenCompanyList(1));
		heldOptions.add(new OpenIndividualList(2));
		heldOptions.add(new OpenLikeableList(3));
		heldOptions.add(new OpenRelationshipList(4));
		heldOptions.add(new StartNewGame(5));
	}
}

class IndividualList extends Menu {
	public IndividualList() {
		//List company leaders
		menuText += "-------------------------------------------\n";
		for (Individual individual : Main.individualList) {
			menuText += individual.toString();
		}
		//List company employees
		menuText += "-------------------------------------------\n";
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenMainMenu(1));
	}
}

class LikeableList extends Menu {
	public LikeableList() {
		menuText = "";
		
		for (Likeable thing : Main.likeableList) {
				menuText += thing.likeableOutput() + " \n";
		}
		
		
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenMainMenu(1));
	}
}

class RelationshipList extends Menu {
	public RelationshipList() {
		menuText = "";
		
		for (Likeable thing : Main.likeableList) {
			for (Relationship relationship : thing.viewRelationship()) {
				menuText += thing.likeableOutput() + " " + relationship.toString() + " \n";
			}
		}
		
		
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenMainMenu(1));
	}
}

class CompanyList extends Menu {
	public CompanyList() {
		for (Company company : Main.companyList) {
			menuText += company.toString();
		}
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenMainMenu(1));
		heldOptions.add(new AddCompany(2));
	}
}

class GameMenu extends Menu {
	public GameMenu () {
		Company playerCompany = Main.playerCompany;
		Individual player = Main.playerCompany.leader;
		String companyText = playerCompany.name;
		String playerText = player.fName + " " +  player.MI + " " + player.lName;
		menuText = "You are " + playerText + " of the company " + companyText + " and have been given $100,000 as part of your initiation into a shadowy organization known as TOFAC, or The Organization, Federation, and Association Cooperative. You must be the first company standing to reach fifty million dollars, or the last company standing.";
		
		heldOptions.add(new Quit(0));
		heldOptions.add(new Hire(1));
		heldOptions.add(new OpenViewCompanies(2));
	}
}

class ViewCompanies extends Menu {
	public ViewCompanies() {
				for (Company company : Main.companyList) {
			menuText += company.toString();
		}
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenGameMenu(1));
		heldOptions.add(new AddCompany(2));
	}
}