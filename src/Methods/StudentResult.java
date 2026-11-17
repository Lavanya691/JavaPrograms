package Methods;

import java.util.Scanner;

public class StudentResult {	   
	  int[] marks = new int[5];
	  int total =0;
	  double average;
	  String grade;
	  
	  public void acceptMarks() {
		  Scanner sc = new Scanner(System.in);
		  for(int i =0;i<5;i++) {
			  System.out.print("Marks in Subject " + (i) +" is : " );
			  marks[i] = sc.nextInt();
		  }
	  }
	  public void calculateTotal() {
		  total =0;
		  for(int i=0;i<5;i++) {
			  total = total+marks[i];
		  }
	  }
	  
	  public void calculateAverage() {
	
		  for(int i =0;i<5;i++) {
		  average = total/5.0;
		  }

	  }
	  public void FinalGrade() {
		  if (average >= 90 && average <= 100) {
	            grade = "A+";
	        } 
	        else if (average >= 80) {
	            grade = "A";
	        } 
	        else if (average >= 70) {
	            grade = "B";
	        } 
	        else if (average >= 60) {
	            grade = "C";
	        } 
	        else {
	            grade = "Fail";
	        }
	  }
	  public void displayResult() {
		  for (int i = 0; i < 5; i++) {
	            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
	        }
		  System.out.println("Total Marks: " + total);
	      System.out.println("Average: " + average);
	      System.out.println("Grade: " + grade);
	  }
	  public static void main(String[] args) {
		StudentResult s = new StudentResult();
		s.acceptMarks();
		s.calculateTotal();
		s.calculateAverage();
		s.FinalGrade();		
		s.displayResult();
	}
	
}
