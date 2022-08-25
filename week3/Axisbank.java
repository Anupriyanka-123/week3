package week3;
 
public class Axisbank extends Bankinfo {;

public void deposit(){
		super.deposit();
		System.out.println("Axis bank deposit");
}

	public static void main(String[] args) {
		Axisbank obj=new Axisbank();
		obj.deposit();
		obj.fixed();
		obj.saving();
		}
	
		
	}

	
	