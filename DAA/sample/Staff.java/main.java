package staff;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Teaching teaching = new Teaching();
		Technical technical = new Technical();
		Contract contract = new Contract();
		
		teaching.accept(); 
		teaching.display();
		
		technical.accept(); 
		technical.display();
		       	
      	contract.accept();
      	contract.display();
      	
	}

}
