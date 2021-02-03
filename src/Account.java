class UserData{
	
	int id;
	String Name;
	double balance;
	
	void initValues(int pid, String pName, double pBalance) {
		id = pid ;
		Name = pName;
		balance = pBalance;
	}
	void printValues( ) {
		System.out.println("Id : "+id+"Name :"+Name+"Balance: "+balance);
	}
	void checkBalance() {
		System.out.println("Balance= "+balance);
	}
	
}




 class Account {
	public static void main(String args[] ) {
		UserData obj1 = new UserData();
		obj1.initValues(101, "asif", 600.0);
		obj1.printValues();
		
		
		new UserData().printValues();
		
		
		
	}

}
