package test;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number of students;");
		int n=scanner.nextInt();
		
	    student ob1[]= new student[n];
		
		for(int i=0; i<n; i++)
		{
			ob1[i]=new student();
			ob1[i].accept();
		}
		
		for(int i=0; i<n; i++)
		{
			ob1[i].display();
		}
		
	
	}

}
