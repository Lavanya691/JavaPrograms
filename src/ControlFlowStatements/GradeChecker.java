package ControlFlowStatements;

import java.util.Scanner;
public class GradeChecker {
            
	public static void main(String [] args) {
		  
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter The Marks Secured by Student : ");
		int marks = sc.nextInt();
		if(marks<0 || marks>100) {
			System.out.print(" Invalid Marks ");
		} else if(marks>=90 && marks<=100) {
			System.out.print(" Grade : A ");
		}else if(marks>=75 && marks<=89) {
			System.out.print(" Grade : B ");
		}else if(marks>=60 && marks<=74) {
			System.out.print(" Grade : C ");
		}else if(marks>=40 && marks<=59) {
			System.out.print(" Grade : D ");
		}else {
			System.out.print("Fail ");
		}
	}
}
