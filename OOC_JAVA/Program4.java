/*program to find largest number in an array using for loop*/
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of Array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0; i<n; i++) {
			arr[i]=scanner.nextInt();
		}
		int Largest_Number = arr[0];
		for(int i=0; i<n; i++) {
			if(Largest_Number<arr[i]) {
				Largest_Number=arr[i];
			}
		}
		System.out.println("Largest Element = " +Largest_Number);
	}
}

