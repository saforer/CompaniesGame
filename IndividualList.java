class IndividualList extends Menu {
	public IndividualList() {
		//List company leaders
		menuText += "-------------------------------------------\n";
		for (Company company : Main.companyList) {
			menuText += company.leader.toString();
		}
		//List company employees
		menuText += "-------------------------------------------\n";
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenMainMenu(1));
	}
}