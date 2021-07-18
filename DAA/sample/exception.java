package staff;
import java.lang.Exception;
import java.util.Scanner;
public class exception {

	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(b!=0) {
			System.out.println(+a +"/"+ +b+ " = "+(((float) a)/b));	
		}
		else {
			throw new Exception("b is zero");
		}	
	}
}
