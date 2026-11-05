package LoopingStatements;
import java.util.*;
public class BreakAndContinue {

	public static void main(String[] args) {
		
//1 to 50 nums without 5 multiples
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the value of n : ");
//		int n = sc.nextInt();
//		for(int i = 1;i<=n;i++) {
//			if(i%5 ==0) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
		
		

//1 to 20 nums break at 12
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter any Number : ");
//		int n = sc.nextInt();
//		for(int i = 1;i<=20;i++) {
//			if(i == 12){
//				break;
//			}
//			System.out.print(i + " ");
//		}
		
		
//1 to 30 Odd Numbers using continue
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter any number : ");
//		int n = sc.nextInt();
//		for(int i=1;i<=30;i++) {
//			if(i%2==0 ) {
//				continue;
//			}
//			System.out.print(i+ " ");
//		}
		
		
// Enter password upto 5 chance if correct terminate
//		Scanner sc = new Scanner(System.in);
//		String correctpass = "Java@123";
//		for(int i=1;i<=5;i++) {
//			System.out.print("Enter the Password : ");
//			String password = sc.nextLine();
//			if(password.equals( correctpass)) {
//				System.out.println("Password is Correct");
//				break;
//			}else {
//			System.out.println("Password is Incorrect");
//			}
//		}
		
		
//take 10 inputs from user if negative num skip that
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<=10;i++) {
			System.out.print("Enter number " + i + " :");
			int n = sc.nextInt();
			if(n<0) {
				continue;
			}
			System.out.println(n);
		}
	}

}
