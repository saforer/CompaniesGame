import java.util.*;

class Company {
	public String name;
	public Individual leader;
	public int dollars;
	public List<Individual> employeeList = new ArrayList<Individual>();
	
	public String toString() {
		int nameLength = 10;
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
}