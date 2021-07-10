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

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of students:");
		int n = scanner.nextInt();
		
		student obj[] = new student[n];
		for(int i=0; i<n; i++) {
			obj[i]=new student();
			obj[i].getdata();
		}
		for(int i=0; i<n; i++) {
			obj[i].display();
		}
	
	}

}
