import java.util.*;

public interface Likeable {
	public String likeableOutput();
	public List<Relationship> viewRelationship();
	public void formRelationship(Likeable inLikeable);
}