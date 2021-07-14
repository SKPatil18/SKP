package student;
import java.util.Scanner;
public class stack {
	private int arr[],size,top;
	
	stack(int size){
		this.size=size;
		arr = new int[size]; 
		top = -1;
	}
	
	public void push(int n) {
		if(top==size-1) {
			System.out.println("Stack is full!");
		}
		else
		   arr[++top]=n;
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty!");
		}
		else
		   System.out.println("Element popped is "+arr[top]);
		   top--;
		
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty!");
		}
		else {
		
			System.out.println("Stack elements are:");
			for(int i=top; i>=0; i--) {
				System.out.println(" "+arr[i]);
			}
			
		}
		
		
	}
  
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter stack size:");
		int size = scanner.nextInt();
		stack obj = new stack(size);
				
		while(true) {
			System.out.println("Stack operations:");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:System.out.println("Enter an element to push:");
			       obj.push(scanner.nextInt());
			       break;
			case 2:obj.pop();
			       break;
			case 3:obj.display();
			       break;
			case 4:System.exit(0);
			default:System.out.println("Enter right choice:");
					
	     	}
		}
	}
}
