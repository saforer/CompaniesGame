class Quit extends MenuOption {
	
	public Quit(int i) {
		optionText = i + ") Quit Game";
	}
	
	public void Do() {
		Main.running = false;
	}
}