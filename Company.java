import java.util.*;

class Company implements Likeable {
	public String name;
	public Individual leader;
	public String uniqueID;
	public int dollars;
	public List<Individual> employeeList = new ArrayList<Individual>();
	public List<Relationship> relationshipOut = new ArrayList<Relationship>();
	
	
	public String toString() {
		String output  = "------------------COMPANY------------------\n";
		output += "|                    " + name + "                  |\n";
		String dollarsFormatted = String.format("%7s", dollars).replace(' ', '0');
		dollarsFormatted = new StringBuilder(dollarsFormatted).insert(0, "$").toString();
		dollarsFormatted = new StringBuilder(dollarsFormatted).insert(2, ",").toString();
		dollarsFormatted = new StringBuilder(dollarsFormatted).insert(6, ",").toString();
		output += "|                " + dollarsFormatted + "               |\n";
		output += "------------------LEADER-------------------\n";
		output += leader.toString();
		output += "-------------------------------------------\n";
		return output;
	}
	
	public String likeableOutput() {
		return name;
	}
	
	public void formRelationship(Likeable inLikeable) {
		
	}
	
	public List<Relationship> viewRelationship() {
		return relationshipOut;
	}
}