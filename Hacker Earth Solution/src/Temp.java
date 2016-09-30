
public class Temp extends Temp1{
	static void getValue(){
		System.out.println("Temp");
		
	}
	public static void main(String[] args) {
		Temp1 t = new Temp();
		t.getValue();
		t =  new Temp1();
		t.getValue();
	}
}

class Temp1{
	static void getValue(){
		System.out.println("Temp1");
	}
}
