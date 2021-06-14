import java.util.Scanner;
public class Student {
	private String usn,name,branch,ph;
	
	public void accept(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter usn:");
		usn = scanner.next();
		
		System.out.println("Enter name:");
		name = scanner.next();
		
		System.out.println("Enter branch:");
		branch = scanner.next();
		
		System.out.println("Enter ph no:");
		ph = scanner.next();
		}
	
	public void display() {
		System.out.println("Student details:");
		System.out.println("USN:"+usn);
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
		System.out.println("Ph no:"+ph);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of Students:");
		int n = scanner.nextInt();
		Student ob1[] = new Student[n];
		
		for(int i=0; i<n; i++) {
			ob1[i] = new Student();
			ob1[i].accept();
		}
		
		for(int i=0; i<n; i++) {
			ob1[i].display();
		}

	}

}
