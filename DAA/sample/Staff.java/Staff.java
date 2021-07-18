package staff;
import java.util.Scanner;
public class Staff {
	private String staffid,name,ph,salary;
	public void accept() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter staff id:");
		staffid = scanner.next();
		System.out.println("Enter staff name:");
		name = scanner.next();
		System.out.println("Enter ph no:");
		ph = scanner.next();
		System.out.println("Enter salary:");
		salary = scanner.next();
		
	}
	public void display() {
		System.out.println("Id = "+staffid);
		System.out.println("Name = "+name);
		System.out.println("ph = "+ph);
		System.out.println("salary = "+salary);
		
	}

}

class Teaching  extends Staff {
	 String domain;
	 String[] publications;
	 public void accept() {
		 Scanner scanner = new Scanner(System.in);
		 super.accept();
		 System.out.println("Enter domain:");
		 domain = scanner.next();
		 System.out.println("Enter no of publications:");
		 int n = scanner.nextInt();
		 publications = new String[n];
		 System.out.println("Enter publications:");
		 for(int i=0; i<n; i++) { 
			 publications[i] = scanner.next();
		 }
	
   }
	 public void display() {
		 super.display();
		 System.out.println("Domain= "+domain);
		 System.out.println("Publications are:");
		 for(int i=0; i<publications.length; i++) {
			 System.out.println(""+publications[i]);
		 }
	 }
}

class Technical extends Staff{
	String[] skills;
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		super.accept();
		System.out.println("Enter no of skills:");
		int n = scanner.nextInt();
		skills = new String[n];
		System.out.println("Enter the skills:");
		for(int i=0; i<n; i++) {
			skills[i] = scanner.next();
		}
	}
	
	public void display() {
		super.display();
		System.out.println("skills are:");
		for(int i=0; i<skills.length; i++) {
			System.out.println(""+skills[i]);
		}
	}
	
}
class Contract extends Staff{
	int period;
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		super.accept();
		System.out.println("Enter period:");
		period = scanner.nextInt();
		
	}
	
	public void display() {
		super.display();
		System.out.println("Period = "+period);
	}

}











