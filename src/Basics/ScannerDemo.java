package Basics;

import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Your Name : ");
		String name = sc.nextLine();
		
		
		
		System.out.print("Please Enter Your Age : ");
		int age = sc.nextInt();
		//sc.nextLine();
		
		System.out.print("Please Enter Your Subject : ");
		String subject = sc.next();
		
		
		
		System.out.println("My name is : " +name);
		System.out.println("My Age is : " +age);
		System.out.println("My Subject is : " +subject);
		
		

	}

}
