
public class ComplexThis {
	int x;
	ComplexThis(int x ){
		this.x = x;
		System.out.println(x*x);
	}

	void firstMethod(ComplexThis obj) {
		System.out.println("method 1");
		
	}
	void secondMethod() {
		firstMethod(this);
		System.out.println("method 2");
		
	}
	public static void main(String args[]) {
		ComplexThis obj1 = new ComplexThis(5);
		obj1.secondMethod();
	}
}
