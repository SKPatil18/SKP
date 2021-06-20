/*program to find Largest number in an array using while loop*/
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of Array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0; i<n; i++) {
			arr[i]=scanner.nextInt();
		}
		int large=0;
		int i=0;
		while(large<arr[i]) {
			large = arr[i];
			i++;
		}
		System.out.println("Largest Element = "+large);
		

	}

}
