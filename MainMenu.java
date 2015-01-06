class MainMenu extends Menu {
	public MainMenu() {
		menuText = "This is the main menu, isn't that great!?";
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenCompanyList(1));
		heldOptions.add(new OpenIndividualList(2));
		heldOptions.add(new OpenLikeableList(3));
	}
}