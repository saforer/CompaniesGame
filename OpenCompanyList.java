class OpenCompanyList extends MenuOption {
	public OpenCompanyList(int i) {
		optionText = i + ") Open Company List";
	}
	
	public void Do() {
		Main.currentMenu = new CompanyList();
	}
}