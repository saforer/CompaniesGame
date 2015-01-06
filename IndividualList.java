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