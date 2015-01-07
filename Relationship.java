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
	
	public static void pairedRelationship(Likeable a, Likeable b) {
		//Look to see if a has a relationship with b already
		if (!(a.viewRelationship().contains(b))) {
			//If they don't then form a relationship
			a.formRelationship(b);
		}
		
		//Look to see if b has a relationship with a already
		if (!(b.viewRelationship().contains(a))) {
			//If they don't then form a relationship
			b.formRelationship(a);
		}
	}
}