class OpenLikeableList extends MenuOption {
	public OpenLikeableList(int i) {
		optionText = i + ") Open List of Likeable Things.";
	}
	
	public void Do() {
		Main.currentMenu = new LikeableList();
	}
}