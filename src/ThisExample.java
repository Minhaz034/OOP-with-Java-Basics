 class ThisExample {
	void printerOne() {
		System.out.println("!st method ");
	}
	
	void printer2() {
		System.out.println("2nd Method");
		this.printerOne();
	}
	
	public static void main(String args[]) {
		ThisExample  object = new ThisExample();
		object.printer2();
	}
	
}
