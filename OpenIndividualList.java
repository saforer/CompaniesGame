class OpenIndividualList extends MenuOption {
	public OpenIndividualList(int i) {
		optionText = i + ") Open Individual List";
	}
	
	public void Do() {
		Main.currentMenu = new IndividualList();
	}
}