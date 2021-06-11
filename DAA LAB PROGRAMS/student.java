package myfirstjava;
import java.util.Scanner;
public class student {
	private String usn,name,branch,ph;
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter usn:");
		usn=scanner.next();
		
		System.out.println("enter name:");
		name=scanner.next();
		
		System.out.println("enter branch:");
		branch=scanner.next();
		
		System.out.println("enter phone no:");
		ph=scanner.next();
	}
	public void display() {
		System.out.println("student details");
		System.out.println("student usn:" +usn);
		System.out.println("student name:" +name);
		System.out.println("student branch:" +branch);
		System.out.println("student ph:" +ph);
		System.out.println(" ");
	}


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number of students;");
		int n=scanner.nextInt();
		
	    student ob1[]= new student[n];
		
		for(int i=0; i<n; i++)
		{
			ob1[i]=new student();
			ob1[i].accept();
		}
		
		for(int i=0; i<n; i++)
		{
			ob1[i].display();
		}
		
	
	}

}

