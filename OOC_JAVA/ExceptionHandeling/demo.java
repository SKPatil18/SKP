package ooc;
import java.io.*;
public class demo {
	public void fun(int a, int b)throws Exception{
		try {
		  int c = a/b;
		  System.out.println("Result = "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero!");
		}
		
	}
	
}
