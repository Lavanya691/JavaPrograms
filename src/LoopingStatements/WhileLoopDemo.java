package LoopingStatements;
import java.util.*;
public class WhileLoopDemo {
       public static void main(String [] args) {
//    	   int i = 10;
//    	   while(i>=1) {
//    		   System.out.println(i);
//    		   i--;
//    	   
//       	   }
    	   
//Multiples of 2
//    	   int num =2;
//    	   int i =1;
//    	   while(i<=10) {
//    		   System.out.print(num * i + " ");
//    		   i++;
//    	   }
    	   

    	   
//Multiplication table of 2
//    	   int num = 2;
//    	   int i = 1;
//    	   while(i<=20) {
//    		   System.out.println(num + " x " + i + " = " + (num*i));
//    		   i++;
//    	   }
    	   
    	   
// even and odd num 1 to 100
//    	   System.out.println("-----------------------Even Numbers---------------------");
//    	   int i = 0;
//    	   while(i<=100) {
//    		   if(i %2 ==0) {
//    			   System.out.print(i+ " ");
//    			  
//    		   }
//    		   i++;
//    	   }
//    	   System.out.println(" ");
//    	   System.out.println("-----------------------Odd Numbers---------------------");
//       i=0;
//    	   while(i<=100) {
//    		   if(i%2 !=0) {
//    			   System.out.print(i+" ");
//    		   }
//    		   i++;
//    	   }
    	   
    	   
//sum of n natural numbers
//    	  Scanner sc = new Scanner(System.in);
//    	  System.out.print("Enter a number: ");
//    	  int n = sc.nextInt();
//    	  int sum =0;
//    	  int i =0;
//    	  while(i<=n) {
//    		  //sum = (n*(n+1))/2;
//    		  sum +=i;
//    		  i++;
//    	  }
//    	  System.out.println("Sum is : "+sum);
    	   
    	   
//Factorial of a number 
//    	   Scanner sc = new Scanner(System.in);
//    	   System.out.print("Enter any number : ");
//    	   int n = sc.nextInt();
//    	   int fact = 1;
//    	   int i=1;
//    	   while(i<=n) {
//    		   fact = fact*i;
//    		   i++;
//    	   }
//    	   System.out.print(fact);
    	   
    	   
    	   
    	   
    	   
//Reverse of a number 
//    	   Scanner sc = new Scanner(System.in);
//    	   System.out.print("Enter any number : ");
//    	   int n = sc.nextInt();
//    	   int rev =0;
//    	   int temp=n;
//    	   while(temp>0) {
//    		  int rem = temp % 10;
//    		  rev = rev *10 + rem;
//    		  temp = temp/10;
//   	   }
//    	   System.out.println(rev);
    	   
    	   
    	   
    	   
//Palindrome 
//    	   Scanner sc = new Scanner(System.in);
//    	   System.out.println("Enter any number : ");
//    	   int n = sc.nextInt();
//    	   int rev = 0;
//    	   int i = n;
//    	 
//    	   while(i>0) {
//    		   int rem = i%10;
//    		   rev = rev *10+rem;
//    		   i = i/10;
//    	   }
//    	   if(rev == n) {
//    		   System.out.println("It is a palindrome");
//    	   }else {
//    		   System.out.println("It is not a palindrome");
//    	   }
    	   
    	   
//prime numbers
//    	   Scanner sc = new Scanner(System.in);
//    	   System.out.println("Enter any number : ");
//    	   int n = sc.nextInt();
//    	   int count = 0;
//    	   int i = 1;
//    	   while(i<=n) {
//    		   if(n%i == 0) {
//    			   count++;
//    			 
//    		   }
//    		   i++; 
//    	   }
//    		   if(count == 2) {
//    			   System.out.println("It is a prime number");
//    		   }else {
//    			   System.out.println("It is a not prime number");
//    		   }
    	   
  
    	   
//1 to 100 prime numbers 
//    	   Scanner sc = new Scanner(System.in);
//    	   System.out.print("Prime numbers between 1 to 100 are : ");
//    	   int n = sc.nextInt();    	   
//    	   int i =2;
//    	   while(i<=n) {
//    		   int count = 0;
//    		   i++;
//     	   int j = 1;
//    	   do {
//    		   if(i%j == 0) {
//    			   count++;
//    		   }
//    		   j++;
//    		   
//    		   
//    	   }while(j<=i);
//    	   if(count == 2) {
//    		   System.out.print(i+ " ");
//    	   }
//    	      	   
//    	   }
    	   
    	   
    	   
//Armstrong
//    	   Scanner sc = new Scanner(System.in);
//    	   System.out.print("Enter any number: ");
//    	   int n = sc.nextInt();
//    	   int digit = 0;
//    	  
//    	   int sum =0;
//    	   int temp = n;
//    	   while(temp>0) {
//    		   digit++;
//    		   temp= temp/10;
//    	   }
//    	   temp =n;
//    	   while(temp>0) {
//    		   int rem = temp%10;
//    		   int power = 1;
//        	   int j = 1;
//    	   while(j<=digit) {
//    		   power = power*rem;
//    		   j++;
//    	   }
//    	   sum = sum+power;
//    	   temp = temp/10;
//    	   }
//    	   if(sum == n) {
//        	   System.out.println("It is a Armstrong number");
//        	   } else {
//        		   System.out.println("It is not a Armstrong");
//        	   }
    	   
   
    	   
//Fibanocci Series
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter any number : ");
    	   int n = sc.nextInt();
    	   int a=0,b=1;
    	   while(n>0) {
    		   
    	   }
    	   
    	   
    		   
       }
}
