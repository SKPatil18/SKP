/*Program to find Largest Number Using Simple if*/

import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.print("Enter first Number:");
		int x=number.nextInt();
		System.out.print("Enter Second Number:");
	    int y=number.nextInt();
		System.out.print("Enter third Number:");
		int z=number.nextInt();	
		if(x>y && x>z) {
			System.out.println("Largest Number is:" +x);
		}
		if(y>x && y>z) {
			System.out.println("Largest Number is:" +y);
		}
		if(z>x && z>y) {
			System.out.println("Largest Number is:" +z);
		}
	}
}



