package week3;

public class Exe extends Pet {
	
	public void Learninheritance() {
		System.out.println("inheritance types");
		
	}

	public static void main(String[] args) {
		Exe call=new Exe();
		call.barking();
		call.chasing();
		call.eating();
		call.lovablefeatures();
		call.provideSecurity();
		String colour2=call.colour;
		System.out.println(colour2);
		// TODO Auto-generated method stub

	}

}
