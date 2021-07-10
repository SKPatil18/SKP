package student;
import java.util.Scanner;

public class student {
	Scanner input = new Scanner(System.in);
	private String name,usn,branch,ph;
	
	public void getdata() {
		System.out.println("Enter student name:");
		name = input.next();
		System.out.println("Enter student usn:");
		usn = input.next();
		System.out.println("Enter student branch:");
		branch = input.next();
		System.out.println("Enter student ph:");
		ph = input.next();
	}
	public void display() {
		System.out.println("Student details are:");
		System.out.println("Student name = "+name);
		System.out.println("Student USN = "+usn);
		System.out.println("Student branch = "+branch);
		System.out.println("Student ph = "+ph);
	}
}
