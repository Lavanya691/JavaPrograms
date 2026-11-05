package Basics;

import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student ID : ");
		int ID = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();
				
		
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Course That Enrolled : ");
		String course = sc.next();
		
		System.out.print("Course Fee : ");
		double fees = sc.nextDouble();
		
		System.out.print("City : ");
		String city = sc.next();
		
		System.out.println("My ID is : " +ID);
		System.out.println("My Name is : " +name);
		System.out.println("My age is : " +age);
		System.out.println("Course I Enrolled : " +course);
		System.out.println("Total Fee : " +fees);
		System.out.println("City is : " +city);
	}

}
