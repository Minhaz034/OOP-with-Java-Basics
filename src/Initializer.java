class Dataframe{
	int id;
	String name;
	void initializeVariable(int ID, String NAME) {
		id = ID;
		name = NAME;		
	}
	void printerFunction() {
		System.out.println("Id:" +id+"\nName: "+name);
	}
	
}

class Initializer{
	public static void main(String args[]) {
		Dataframe obj = new Dataframe();
		obj.initializeVariable(19761, "Robert Baratheon");
		obj.printerFunction();
		
		Dataframe obj2 = new Dataframe();
		obj2.initializeVariable(19762, "Stannis Baratheon");
		obj2.printerFunction();
		
		Dataframe obj3 = new Dataframe();
		obj3.initializeVariable(19763, "Renley Baratheon");
		obj3.printerFunction();
		
		new Dataframe().printerFunction();
		
	}
	
}



















