import java.util.*;

class Factory {
	public static void GenerateCompany() {
		boolean temp = true;
		Company output = new Company();
		String tempName = "";
		
		while (temp) {
			temp = false;
			tempName = GenerateCompanyName();
			for (Company company : Main.companyList) {
				if (tempName == company.name) {
					temp = true;
				}
			}
		}
		
		
		output.leader = GenerateIndividual();
		output.leader.leadFlag = true;
		output.name = tempName;
		output.dollars = 100000;
		
		//Form relationships with everyone already in the game
		for (Likeable likeable : Main.likeableList) {
			Relationship.pairedRelationship(output, likeable);
		}
		
		Main.likeableList.add(output);
		Main.companyList.add(output);
	}
	
	public static Individual GenerateIndividual() {
		boolean temp = true;
		Individual output = new Individual();
		String tempSSN = "";
		while (temp) {
					temp = false;
					tempSSN = IndividualSSN();
					for (Individual individual : Main.individualList) {
						if (tempSSN == individual.SSN) {
							temp = true;
						}
					}
				}
		
		
		output.SSN = tempSSN;
		output.fName = IndividualName(0);
		output.MI = IndividualName(1);
		output.lName = IndividualName(2);
		output.dollars = 5000;
		
		for (Likeable likeable : Main.likeableList) {
			Relationship.pairedRelationship(output, likeable);
		}
		
		Main.likeableList.add(output);
		Main.individualList.add(output);
		return output;
	}
	
	public static String GenerateCompanyName() {
		String companyName;
		Random r;
		char c;
		r = new Random();
		c = (char)(r.nextInt(26) + 'A');
		companyName = "" + c;
		r = new Random();
		c = (char)(r.nextInt(26) + 'A');
		companyName = companyName + c;
		r = new Random();
		c = (char)(r.nextInt(26) + 'A');
		companyName = companyName + c;
		return companyName;
	}
	
	public static String IndividualSSN() {
		int minimum = 0;
		int maxValue = 1000000000;
		Random rn;
		String output = "";
		int preOutput;

		rn = new Random();
		preOutput = minimum + rn.nextInt(maxValue - minimum + 1);
		output = String.format("%9s", preOutput).replace(' ', '0');
		output = new StringBuilder(output).insert(2, "-").toString();
		output = new StringBuilder(output).insert(6, "-").toString();
		
		return output;
	}
	
	public static String IndividualName(int i) {
		String[] validNames = new String[] {"Temp"};
		String output;
		switch(i) {
			case 0:
				validNames = new String[] {"Noah", "Liam", "Jacob", "Mason", "William", "Ethan", "Michael", "Alexander", "Jayden", "Daniel", "Sophia", "Emma", "Olivia", "Isabella", "Ava", "Mia", "Emily", "Abigail", "Madison", "Elizabeth"};
				break;
			case 1:
				validNames = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
				break;
			case 2:
				validNames = new String[] {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Hernandez", "Moore", "Martin", "Jackson", "Thompson", "White", "Lopez"};
				break;
		}
		
		Random r = new Random();
		int index = r.nextInt(validNames.length);		
		output = validNames[index];
		return output;
	}
}