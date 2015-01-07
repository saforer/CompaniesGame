import java.util.*;

class Game {
	public static List<Company> companyList = new ArrayList<Company>();
	public static List<Individual> individualList = new ArrayList<Individual>();
	public static List<Likeable> likeableList = new ArrayList<Likeable>();
	public static boolean running = true;
	public static Menu currentMenu;
	public static Company playerCompany;
	//Should I display the "This is the backstory" message when you hit the main menu?
	public boolean justStarted = true;
	public Game() {
			
	}
}