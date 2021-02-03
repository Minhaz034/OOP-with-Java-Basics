class Bike{
	int roll;
	String name,codingSkill;
	double cgpa;
	Bike(){
		System.out.println("I use default null values");
	}
	Bike(int param_roll ,String param_name,double param_cgpa){
		roll = param_roll;
		name = param_name;
		cgpa = param_cgpa;
	}
	
	Bike(int param_roll ,String param_name,double param_cgpa,String paramCodingSkill){
		roll = param_roll;
		name = param_name;
		cgpa = param_cgpa;
		codingSkill = paramCodingSkill;
	}
	
	Bike(Bike internalObject){
		roll = internalObject.roll;
		name = internalObject.name;
		cgpa = internalObject.cgpa;
	}
	void display() {
		System.out.println("Roll: "+roll+"\tName: "+name+"\tCGPA: "+cgpa+"Coding skill:"+codingSkill);
	}
	
	public static void main(String args[]) {
		
		Bike obj1 = new Bike(1503001,"Farhan Ishrak",3.45);
		obj1.display();
		
		Bike obj2 = new Bike(1503002,"Mony Mondal",3.45);
		obj2.display();
		Bike obj3 = new Bike(1503003,"Jihanul Islam",3.45);
		obj3.display();
		Bike obj4 = new Bike(1503004,"tasmia Jannat",3.45);
		obj4.display();
		Bike obj5 = new Bike(1503005,"Shoyeb Ahmed",3.45,"Mediocre");
		obj5.display();
		Bike copyObject  = new Bike(obj5);
		copyObject.display();
		
		Bike obj6 = new Bike();
		obj6.roll = obj5.roll;
		obj6.name = obj5.name;
		obj6.codingSkill = obj5.codingSkill;
		obj6.cgpa = obj5.cgpa;
		obj6.display();
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}