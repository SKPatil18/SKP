package student;
import java.util.Scanner;
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
