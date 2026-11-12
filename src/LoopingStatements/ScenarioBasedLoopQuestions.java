package LoopingStatements;

import java.util.Scanner;

public class ScenarioBasedLoopQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*1. ATM Transaction Summary
An ATM stores the amount withdrawn by a customer every day for 7 days. 
Calculate the total amount withdrawn.
*/
		
//Using array		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter no. of Days :");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		int Total_withdraw_amount =0;
//		System.out.print("Enter the amount drawn in each day :");
//			for(int i =0;i<n;i++) {
//			
//			arr[i]=sc.nextInt();
//			Total_withdraw_amount +=arr[i];
//			
//		}
//		System.out.println("Total withdraw amount is : " +Total_withdraw_amount);
		
//Without using array using only loops
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter No.of Days :");
//		int n = sc.nextInt();
//		int total_amt = 0;
//		System.out.print("Enter the Amount withdrawn : ");
//		for(int i =1;i<=n;i++) {
//			int amount = sc.nextInt();
//			total_amt += amount;
//			
//		}
//		System.out.println("Total amount drwan in 7 days is : " +total_amt);
		
		

/* 2. Shopping Mall Billing
A customer purchases n products. Read the price of each product and calculate the total bill.
Concepts: loop, sum, user input
*/
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter How many products : ");
//		int n = sc.nextInt();
//		int bill = 0;
//		System.out.print("Enter Price of each product :");
//		for(int i = 1;i<=n;i++) {
//			
//			int prize = sc.nextInt();
//			bill = bill+prize;
//			
//		}
//		System.out.println("Total amount Total Bill : " +bill);
		

//with array
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter No. of Products :");
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		int bill = 0;
//		System.out.print("Amount of each product : ");
//		for(int i = 0;i<n;i++) {
//			arr[i] = sc.nextInt();
//			 bill = bill+arr[i];
//		}
//		System.out.print("Total Bill is : " +bill);
		
		
/*3. Student Attendance
A class has 30 students. Attendance is marked as:
1 → Present
0 → Absent
Count the total number of present and absent students.
Concepts: loop, counting
*/
//		Scanner sc = new Scanner(System.in);
//		int present = 0;
//		int absent = 0;
//		System.out.print("Enter attedence  : ");
//		for(int i = 1;i<=30;i++) {
//			int attedence = sc.nextInt();
//			if(attedence ==1) {
//				present++;
//			}else if(attedence == 0) {
//				absent++;
//			}
//		}
//		System.out.println("No.of Students Present are :" +present);
//		System.out.print("No.of Students Absent are :" +absent);
		

/*4. Company Salary Processing
A company has n employees. Read each employee's salary and find:
Highest salary
Lowest salary
Concepts: max, min
*/
//		Scanner sc = new Scanner(System.in);
//		System.out.print("No. of Employees: ");
//		int n = sc.nextInt();
//		int Highest_Sal = 0;
//		int Lowest_Sal = 0;
//		for(int i = 1; i <= n; i++) {
//		    System.out.print("Enter salary of employee " + i + ": ");
//		    int Salaries = sc.nextInt();
//		    if(i == 1) {
//		        Highest_Sal = Salaries;
//		        Lowest_Sal = Salaries;
//		    }
//
//		    if(Salaries > Highest_Sal) {
//		        Highest_Sal = Salaries;
//		    }
//
//		    else {
//		        Lowest_Sal = Salaries;
//		    }
//		}
//
//		System.out.println("Highest Salary is: " + Highest_Sal);
//		System.out.println("Lowest Salary is: " + Lowest_Sal);
		
		
//Electricity bill
		Scanner sc = new Scanner(System.in);
		
		for(int i =1;i<=5;i++) {
			
			System.out.print("Enter Customer " + i + " Bill = ");
			int n =sc.nextInt();
			System.out.println("Customer " + i + " Bill is: " + n);
			
			if(n>0 && n<=100) {
				n = n*2;
			}else if(n>100 && n<=200) {
				n = n*3;
			}else if(n>200 && n<=300) {
				n = n*5;
			}else {
				n=n*7;
			}
			System.out.println("Bill of Customer " + i + "is : " +n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}