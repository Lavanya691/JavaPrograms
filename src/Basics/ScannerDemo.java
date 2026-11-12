package Basics;

import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please Enter Your Name : ");
//		String name = sc.nextLine();
//		
//		
//		
//		System.out.print("Please Enter Your Age : ");
//		int age = sc.nextInt();
//		//sc.nextLine();
//		
//		System.out.print("Please Enter Your Subject : ");
//		String subject = sc.next();
//		
//		
//		
//		System.out.println("My name is : " +name);
//		System.out.println("My Age is : " +age);
//		System.out.println("My Subject is : " +subject);
		
//Ex
		Scanner sc = new Scanner(System.in);
		System.out.println("productID is : ");		
		int productID = sc.nextInt();
		
		System.out.println("product_Name is :  ");
		String product_Name = sc.nextLine();	
		sc.nextLine();
		
		System.out.println("product_quantity is : ");
		float product_quantity = sc.nextFloat();
		
		System.out.println("product_discount is : ");
		double product_discount = sc.nextDouble();
		
		System.out.println("product_Available is : ");
		Boolean product_Available = sc.nextBoolean();
		
		System.out.println("product_price is : ");
		int product_price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("product_code is : ");
		String product_code = sc.nextLine();
		
		System.out.println("product_companycode is : ");
		char product_companycode = sc.next().charAt(0);
		
		System.out.println("product_description is : ");
		String product_description = sc.nextLine();
		sc.nextLine();
		
		
		System.out.println(productID);
		System.out.println(product_Name);
		System.out.println(product_quantity);
		System.out.println(product_discount);
		System.out.println( product_Available);
		System.out.println(product_price);
		System.out.println(product_code);
		System.out.println(product_companycode);
		System.out.println(product_description);


	}

}
