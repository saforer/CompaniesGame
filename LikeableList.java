class LikeableList extends Menu {
	public LikeableList() {
		menuText = "";
		
		for (Likeable thing : Main.likeableList) {
				System.out.println(thing.likeableOutput());
		}
		
		
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenMainMenu(1));
	}
}