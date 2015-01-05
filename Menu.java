import java.util.*;

class Menu {
	public String menuText = "";
	public List<MenuOption> heldOptions = new ArrayList<MenuOption>();
	
	public Menu() {	}
	
	public void Display() {
		System.out.println(menuText);
		
		for (MenuOption option : heldOptions) {
			System.out.println(option.optionText);
		}
	}
}