/*program to calculate sum and average of 5 numbers using for loop*/
import java.util.Scanner;
public class Program7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[]	= new int[5];
		System.out.println("Enter Five Numbers:");
		for(int i=0; i<5; i++) {
			a[i]=scanner.nextInt();
		}
		int sum=0;
		for(int i=0; i<5; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of Five Numbers is:" +sum);
		System.out.println("Average of Five Numbers is:" +sum/5);
		

	}

}






