class MenuOption {
	public String optionText;
	
	public MenuOption() {	}
	
	public void Do() {	}
}

class OpenViewCompanies extends MenuOption {
	public OpenViewCompanies(int i) {
		optionText = i + ") View Companies.";
	}
	
	public void Do() {
		Main.currentMenu = new ViewCompanies();
	}
}

class Hire extends MenuOption {
	public Hire(int i) {
		optionText = i + ") to Hire a new employee.";
	}
	
	public void Do() {
		Main.playerCompany.dollars -= 1000;
		Main.playerCompany.employeeList.add(Factory.GenerateIndividual());
	}
}

class OpenCompanyList extends MenuOption {
	public OpenCompanyList(int i) {
		optionText = i + ") Open Company List";
	}
	
	public void Do() {
		Main.currentMenu = new CompanyList();
	}
}

class AddCompany extends MenuOption {
	public AddCompany(int i) {
		optionText = i + ") Add Company to List";
	}
	
	public void Do() {		
		System.out.println("Company added");
		
	}
}

class StartNewGame extends MenuOption {
	public StartNewGame(int i) {
		optionText = i + ") Start a new game.";
	}
	
	public void Do() {
		Main.playerCompany = Factory.PlayerCompany();
		for (int i = 0; i<10; i++)	{
			System.out.println(Factory.GenerateCompany().toString());
		}		
		Main.currentMenu = new GameMenu();
	}
}

class OpenGameMenu extends MenuOption {
	public OpenGameMenu(int i) {
		optionText = i + ") Main game menu.";
	}
	
	public void Do() {
		Main.currentMenu = new GameMenu();
	}
}

class OpenIndividualList extends MenuOption {
	public OpenIndividualList(int i) {
		optionText = i + ") Open Individual List";
	}
	
	public void Do() {
		Main.currentMenu = new IndividualList();
	}
}

class OpenLikeableList extends MenuOption {
	public OpenLikeableList(int i) {
		optionText = i + ") Open List of Likeable Things.";
	}
	
	public void Do() {
		Main.currentMenu = new LikeableList();
	}
}

class OpenMainMenu extends MenuOption {
	public OpenMainMenu(int i) {
		optionText = i + ") Open Main Menu";
	}
	
	public void Do() {
		Main.currentMenu = new MainMenu();
	}
}

class OpenRelationshipList extends MenuOption {
	public OpenRelationshipList(int i) {
		optionText = i + ") Open List of Relationships.";
	}
	
	public void Do() {
		Main.currentMenu = new RelationshipList();
	}
}

class Quit extends MenuOption {
	
	public Quit(int i) {
		optionText = i + ") Quit Game";
	}
	
	public void Do() {
		Main.running = false;
	}
}