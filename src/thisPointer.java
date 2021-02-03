public class thisPointer {
	int age;
	double iq;
	thisPointer( int age, double iq){
		this.age = age;
		this.iq = iq;
		System.out.println("Constructor runnig \n"+ age+"	"+iq);
	}
			
	
	
	public static void main(String args[]) {
		thisPointer object  = new thisPointer(30, 169);
		
	}
}
