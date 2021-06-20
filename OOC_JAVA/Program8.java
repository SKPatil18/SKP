/*program to calculate sum of 5 numbers using while loop*/
import java.util.Scanner;
public class Program8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[]	= new int[5];
		System.out.println("Enter Five Numbers:");
	
		int i=0;
		while(i<5) {
			a[i]=scanner.nextInt();
			i++;
		}
		
		int sum=0,j=0;
		while(j<5) {
			sum = sum + a[j];
			j++;
		}
		System.out.println("sum of Five Elements is:" +sum);
		System.out.println("Average of Five Numbers is:" +sum/5);		
	}
}




