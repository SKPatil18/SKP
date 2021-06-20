/*program to calculate sum and average of 5 numbers using do while loop*/
import java.util.Scanner;
public class Program9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[]	= new int[5];
		System.out.println("Enter Five Numbers:");
		
		int i=0;
		do {
			a[i] = scanner.nextInt();
			i++;
		}while(i<5);
		 int sum=0,j=0; 
		 do {
			 sum += a[j]; 
			 j++; 
		 }while(j<5);
		 
		System.out.println("Sum of Five Numbers is: "+sum);
		System.out.println("Average of Five Numbers is:" +sum/5);
	}
}








