class OpenRelationshipList extends MenuOption {
	public OpenRelationshipList(int i) {
		optionText = i + ") Open List of Relationships.";
	}
	
	public void Do() {
		Main.currentMenu = new RelationshipList();
	}
}