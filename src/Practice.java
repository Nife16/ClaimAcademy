import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import newPackage.NewClass; 


public class Practice {

	public static void main(String[] args) {
		// write your code here

		Student jarrid = new Student("Jarrid", 1);
		Student joel = new Student("Joel", 2);
		Student fletch = new Student("Fletch", 3);
		Student fred = new Student("Fred", 4);
		Student stephan = new Student("Stephan", 5);
		Student sam = new Student("Sam", 6);
		Student nick = new Student("Nick", 7);
		Student billy = new Student("Billy", 8);
		Student joe = new Student("Joe", 9);
		Student bob = new Student("Bob", 10);
		
		
		//Child child = new Child();
		
		//child.rollCall(child.name, child.studentNo);
		GrandChild gChild = new GrandChild();
		gChild.rollCall("jarrid", 1);
		Scanner scr = new Scanner(System.in);
		Child.fillUp(scr);
		Student[] studentArray = {jarrid, joel, fletch, fred, stephan, sam, nick, billy, joe , bob};
		
		for(Student student: studentArray) {
			student.rollCall(student.name, student.studentNo);
		}
	}
}
