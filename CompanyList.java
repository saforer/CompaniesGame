class CompanyList extends Menu {
	public CompanyList() {
		for (Company company : Main.companyList) {
			menuText += company.toString();
		}
		heldOptions.add(new Quit(0));
		heldOptions.add(new OpenMainMenu(1));
		heldOptions.add(new AddCompany(2));
	}
}