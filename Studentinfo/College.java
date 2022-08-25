package Studentinfo;


public class College extends Student {
	
	public void getstudentinfo()
	{
	    super.getstudentinfo();
		System.out.println("Student deatils are Anu,BCA");
	}
	
	public void getstudentinfo(int id)
	{
		System.out.println("The student ID" +id);
	}
	public void getstudentinfo(int id,String name)
	{
	System.out.println("The student ID and name are "+id+" "+name);
	}
	public void getstudentinfo(long phonenumber,String email)
	{
	System.out.println("The student phonenumber and email are" +phonenumber+ "" +email);	
	}

	public static void main(String[] args) {
		College c=new College();
		c.getstudentinfo();
		c.getstudentinfo(78889);
		c.getstudentinfo(78889,"Anu");
		c.getstudentinfo(412375332,"abc@gamil.com");
	}
}

		
		