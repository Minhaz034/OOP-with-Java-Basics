
public class ThisConstructor {
	int id;
	String name,course;
	double fee;
	public ThisConstructor(int id, String name ,String course) {
		this.id = id;
		this.course = course;
		this.name = name;
				
	}
	ThisConstructor(int id, String name ,String course,double fee){
		this(id,name,course);
		this.fee = fee;
		
	}
	void printValues() {
		System.out.println(id+"    "+name+"    "+course+"    "+fee);
	}
	
	public static void main(String args[]) {
		ThisConstructor obj = new ThisConstructor(001, "Aplha", "CSE 4202",1400);
		obj.printValues();
	}
}
