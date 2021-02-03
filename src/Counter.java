
public class Counter {

	static int count = 0;
	Counter(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		
		Counter object1 = new Counter();
		Counter object2 = new Counter();
		Counter object3 = new Counter();
		
	}
	
}
