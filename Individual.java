class Individual {
	public String SSN;
	public String fName;
	public String MI;
	public String lName;
	public int dollars;
	public boolean leadFlag;
	
	public String toString() {
		int nameLength = 10;
		String padFName = String.format("%" + nameLength + "s", fName).replace(' ', ' ');
		String padMI = MI;
		String padLName = String.format("%-" + nameLength + "s", lName).replace(' ', ' ');
		String Leader;
		if (leadFlag) {
			Leader = "L";
		} else {
			Leader = " ";
		}
		String output = "| " + Leader + " " + SSN + padFName + " " + padMI + ". " + padLName + "   |\n";
		return output;
	}	
}