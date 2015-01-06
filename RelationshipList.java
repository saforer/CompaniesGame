import java.util.*;

class RelationshipList extends Menu {
	public RelationshipList() {
		menuText = "";
		
		for (Likeable thing : Main.likeableList) {
			for (Relationship relationship : thing.viewRelationship()) {
				menuText += thing.likeableOutput() + " " + relationship.toString() + " \n";
			}
		}
		
		
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenMainMenu(1));
	}
}