class OpenMainMenu extends MenuOption {
	public OpenMainMenu(int i) {
		optionText = i + ") Open Main Menu";
	}
	
	public void Do() {
		Main.currentMenu = new MainMenu();
	}
}