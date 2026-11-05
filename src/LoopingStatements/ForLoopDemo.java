package LoopingStatements;
import java.util.Scanner;
public class ForLoopDemo {
public static void main(String [] args) {
	
//multiples of 2 upto 10
//	int num =2;
//	for(int i=1;i<=10;i++) {
//		
//		System.out.println(num*i);
//	}
	
	
	
//multiplication	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number : ");
//	int num =sc.nextInt();
//	for(int i=1;i<=10;i++) {
//		
//	System.out.println(num + "x" + i + "=" +(num*i));

	
//	for(int i = 1;i<=10;i++) {
//		int j = 2 * i;
//		System.out.println(j);

	
	
	
// in reverse
//	for(int i = 10;i>=1;i--) {
//		int j = 2 * i;
//		System.out.println(j);
//	}
	

	
// to print odd and even numbers from 1 to 100
//	System.out.println("------------Even Numbers Are--------------");
//	for(int i = 1;i<=100;i++) {
//		if(i % 2 ==0) {
//			System.out.print(i + " ");
//		} 
//		
//	}
//	System.out.println(" ");
//	
//	System.out.println("------------Odd Numbers Are--------------");
//	for(int i =1;i<=100;i++) {
//		if(i%2 !=0) {
//			System.out.print(i + " ");
//		}
//		
//	}
	
	
//Multiplication
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a number : ");
//	int num = sc.nextInt();
//	for(int i =0;i<=10;i++) {
//		System.out.println(num + " * " + i + " = " +num*i);
//	}

	
//Sum of n natural numbers
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter a Number : ");
//	int num = sc.nextInt();
//	int sum =0;
//	for(int i=0;i<=num;i++) {
//		sum += i;	
//	}
//	System.out.println("Sum is : " +sum);
	
	

//Factorial of a number
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter a Number : ");
//	int num = sc.nextInt();
//	int fact =1;
//	for(int i =1;i<=num;i++) {
//		fact = fact * i;
//	}
//	System.out.print("Factorial of given number is : " +fact);
	

	
//Reverse a number	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter a Number : ");
//	int n = sc.nextInt();
//	int rev =0;
//	for(;n>0;n=n/10) {
//		int rem =n%10;
//		rev =rev*10+rem;
//	}
//	System.out.println(rev);
//	
//	
	
	
//Palindrome of a number
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter a Number : ");
//	int n = sc.nextInt();
//	int temp =n;
//	int rev = 0;
//	for(;n>0;n=n/10) {
//		int rem = n%10;
//		rev = rev*10+rem;
//	}
//	
//	if(temp == rev) {
//		System.out.println("It is Palindrome");
//	}else {
//		System.out.println("It is not a Palindrome");
//	}
	
	

//Prime Numbers
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a number : ");
//	int n = sc.nextInt();
//	int count = 0;
//	for(int i=1;i<=n;i++) {
//		if(n%i==0) {
//			count++;
//		}
//	}
//	if(count ==2) {
//		System.out.println("It is Prime");
//	}else {
//			System.out.println("It is not a Prime");
//	}
	
	
	
	
// 1 to 100 prime numbers
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter n Value : ");
//	int n = sc.nextInt();
//	for(int i =2;i<=n;i++) {
//		int count = 0;
//		for(int j =1;j<=i;j++) {
//			if(i%j == 0) {
//				count++;
//			}
//		}if(count ==2) {
//			System.out.print(i + " ");
//		}
//	}

	
	
	
//Armstrong number
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a number : ");
//	int n = sc.nextInt();
//	int temp=n;
//	int sum =0;
//	int digitcount = 0;
//	for(int i = n;i>0;i = i/10) {
//		digitcount++;
//	}
//	
//	for(int i = n;i>0;i=i/10) {
//		int rem = i%10;
//		int power = 1;
//		for(int j =1;j<=digitcount;j++) {
//			power = power *rem;
//		}
//		sum = sum+power;
//	}if(sum == temp ) {
//		System.out.println("It is Armstrong");
//		}else {
//				System.out.println("It is not a Armstrong");
//		}
	
	
	
//Armstrong method 2
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter a Number : ");
//	int num = sc.nextInt();
//	int temp = num;
//	int sum = 0;
//	int digit = 0;
//	while(temp>0) {
//		digit++;
//		temp=temp/10;
//	}
//	temp =num;
//	while(temp>0) {
//		int rem = temp %10;
//		int power = 1;
//		
//		for(int i =1;i<=digit;i++) {
//			power = power * rem;
//		}
//		sum = sum + power;
//		temp = temp/10;
//	}if(sum == num) {
//		System.out.println("It is Armstrong Number");
//	}else {
//		System.out.println("It is not an Armstrong Number");
//	}
	
	
	
//Fibanocci series
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter a number : ");
//	int n = sc.nextInt();
//	int a = 0;
//	int b = 1;
//	
//	for(int i = 1;i<=n;i++) {
//		System.out.print(a +" ");
//		int c = a+b;
//		a=b;
//		b=c;
//	}
//	
//	sc.close();	
	

}
}
