import java.util.*;

public class Relationship {
	Likeable likedThing;
	int likedAmount = 0;
	
	public Relationship(Likeable inLiked) {
		likedThing = inLiked;
	}
	
	public String toString() {
		String output = "";
		output += likedThing.likeableOutput() + " ";
		output += likedAmount + " ";
		return output;
	}
}