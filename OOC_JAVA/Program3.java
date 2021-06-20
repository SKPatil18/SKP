/*program to find largest number using Nested if*/
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter First No:");
		int x = num.nextInt();
		System.out.print("Enter Second No:");
		int y = num.nextInt();
		System.out.print("Enter Third No:");
		int z = num.nextInt();
		if(x>y) {
			if(x>z) {
				System.out.println("Largest No is:" +x);
			}
		}
		if(y>x) {
			if(y>z) {
				System.out.println("Largest No is:" +y);
			}
		}
		if(z>x) {
			if(z>y) {
				System.out.println("Largest No is:" +z);
			}
		}
	}
}
