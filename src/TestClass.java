class A{
	A(){
		System.out.println("hello from 1st constructor");
	}
	A(int parameter){
		this();
		System.out.println(parameter);
	}
	
}



public class TestClass {
	public static void main(String args[]) {
		A obj = new A(12);
		
	}

}
