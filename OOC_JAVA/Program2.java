/*Program to find largest number using if-else*/
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First No:");
		int x = scanner.nextInt();
		System.out.print("Enter Second No:");
		int y = scanner.nextInt();
		System.out.print("Enter Third No:");
		int z = scanner.nextInt();
		
		if(x>y && x>z) {
			System.out.println("Largest No is " +x);
		}
		else if(y>x && y>z){
			System.out.println("Largest No is " +y);
		}
		else {
			System.out.println("Largest No is " +z);
		}
	}
}
