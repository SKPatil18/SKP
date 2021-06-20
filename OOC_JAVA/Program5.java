/*program to find smallest number in an array using for loop*/
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of Array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0; i<n; i++) {
			arr[i]=scanner.nextInt();
		}
		int smallest = arr[0];
		for(int i=0; i<n; i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest Element = " +smallest);
	}
}







