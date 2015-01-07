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
		Main.currentGame.currentMenu = new ViewCompanies();
	}
}

class Hire extends MenuOption {
	public Hire(int i) {
		optionText = i + ") to Hire a new employee.";
	}
	
	public void Do() {
		int employeecost = 20000;
		if (Main.currentGame.playerCompany.dollars >= employeecost) {
			Main.currentGame.playerCompany.dollars -= employeecost;		
			Individual tempIndividual = Factory.GenerateIndividual();
			System.out.println(tempIndividual.toString());
			Main.currentGame.playerCompany.employeeList.add(tempIndividual);
		} else {
			System.out.println("You need " + employeecost + " to purchase an employee, and only have " + Main.currentGame.playerCompany.dollars);
		}
	}
}

class StartNewGame extends MenuOption {
	public StartNewGame(int i) {
		optionText = i + ") Start a new game.";
	}
	
	public void Do() {
		Main.currentGame.playerCompany = Factory.PlayerCompany();
		for (int i = 0; i<10; i++)	{
			System.out.println(Factory.GenerateCompany().toString());
		}		
		Main.currentGame.currentMenu = new GameMenu();
	}
}

class OpenGameMenu extends MenuOption {
	public OpenGameMenu(int i) {
		optionText = i + ") Main game menu.";
	}
	
	public void Do() {
		Main.currentGame.currentMenu = new GameMenu();
	}
}

class OpenMainMenu extends MenuOption {
	public OpenMainMenu(int i) {
		optionText = i + ") Open Main Menu";
	}
	
	public void Do() {
		Main.currentGame.currentMenu = new MainMenu();
	}
}

class Quit extends MenuOption {
	
	public Quit(int i) {
		optionText = i + ") Quit Game";
	}
	
	public void Do() {
		Main.currentGame.running = false;
	}
}