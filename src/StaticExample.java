class Creator{
	static int id=3;
	static String style = "tactical";
	void printer() {
		System.out.println(id+"	"+style);
	}
	static int cube() {
		return id*id*id;
	}
	
	static void  changeStyle() {
		style = "tapered";
		System.out.println(id+style);
	}
	
}


public class StaticExample {
	public static void main(String args[] ) {
		System.out.println(Creator.cube()); 
		Creator.changeStyle();
		
		Creator obj1 = new Creator();
		obj1.printer();
		
		Creator.cube();
		Creator.changeStyle();
		
		//int result = obj1.cube();
		//System.out.println(result);
		
		//System.out.println(obj1.id+"	"+obj1.cube());
		
	}
	
}
