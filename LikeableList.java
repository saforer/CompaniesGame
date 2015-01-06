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