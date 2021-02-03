class Equalizer{
	double number;
	public Equalizer() {
		
		this(223);
		System.out.println("Constructor1 ");
	}
	
	Equalizer(int param){
		System.out.println("Constructor 2 with value = "+param);
	}
}



public class P1 {
	public static void main(String args[]) {
		Equalizer obj = new Equalizer();
		
	}

}
