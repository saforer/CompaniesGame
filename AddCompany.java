class AddCompany extends MenuOption {
	public AddCompany(int i) {
		optionText = i + ") Add Company to List";
	}
	
	public void Do() {
		Factory.GenerateCompany();
		Main.currentMenu = new CompanyList();
	}
}