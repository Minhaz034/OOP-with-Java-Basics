
abstract class HondaBiker {
	abstract void run();
}

class Biker extends HondaBiker{
	
	void run() {
		System.out.println("run forest run!!!");
	}
	public static void main(String args[]) {
		Biker obj  = new Biker();
		obj.run();
	}
}
