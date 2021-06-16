import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		  System.out.println("Enter size of array:"); 
		  int n=scanner.nextInt();
		  
		  int arr[]=new int[n];
		  
		  System.out.println("Enter Array Elements:");
			for(int i=0; i<n; i++) {
				
				arr[i]=scanner.nextInt();
			}
			
			System.out.println("Array elements are:");
		    for(int i=0; i<n; i++) {
				
		    	System.out.println(+arr[i]);
			}
	}
}
