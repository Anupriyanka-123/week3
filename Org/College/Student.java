package Org.College;

public class Student extends Department {

		// TODO Auto-generated method stub
		public void studentName() {
			System.out.println("Anu");

		}
		public void studentDept() {
			System.out.println("BCA");

		}
		public void studentId() {
		System.out.println("15105001");

		}
		 public static void main(String[] args) {
		 Student obj = new Student();
		 System.out.println("Details from College");
		 obj.collegename();
		 obj.collegecode();
		 obj.collegerank();
		 System.out.println(" Details from Department");
		 obj.deptName();
		 System.out.println(" Details from Student");
		 obj.studentName();
		 obj.studentDept();
		 obj.studentId();
		 }
}