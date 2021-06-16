package daa2;
import java.util.Scanner;
public class Stack {
	private int arr[],top,size;
	
	public Stack(int size) {
		this.size=size;
		arr = new int[size];
		top=-1;
	}
	
	public void push(int x) {
		if(top==size-1) {
			System.out.println("Stack is Full!:");
		}
		arr[++top]=x;
	
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is Empty!");
		}
		System.out.println("Popped Element is "+arr[top--]);
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("No Elements to Display");
		}
		System.out.println("Stack Elements are:");
		for(int i=top; i>=-1; i--) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Stack size:");
		int n=scanner.nextInt();
		
		Stack stack=new Stack(n);
		
		while(true) {
			System.out.println("Stack Operations:");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			System.out.print("Choose 1 Operation:");
			int choice = scanner.nextInt();
			
			switch(choice){
			case 1:System.out.println("Enter Element to Push:");
				  stack.push(scanner.nextInt());
				  break;
			case 2:stack.pop();
			      break;
			case 3:stack.display();
			 	  break;		
			default:System.out.println("Enter Right Choice:");
			
			}
		}	
	}
}
