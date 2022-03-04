
public class Student {

	String name;
	int studentNo;
	String studentsSchool;
	final private String[] schools = {"Ladue", "Normandy", "Parkway"};
	
	Student() {
		
	}
	Student(String name, int studentNo) {
		this.name = name;
		this.studentNo = studentNo;
	}
	
	public static void rollCall(String name, int studentNo) {
		System.out.println(name + ", " + studentNo);
	}
	
	
	
	public void drive() {
		
	}
	
	public void fillUp() {
		
	}
}
