package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class SingleDimen {

	public static void main(String[] args) {
//		int arr[];
//		arr = new int[5];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		for(int i = 0;i<arr.length;i++) {
//		System.out.print(arr[i] + " ");
//		}
		
		

//		int[] arr = {10,20,30,40,50};
//		for(int i = 0;i<arr.length;i++) {
//			System.out.print(arr[i] +" ");
//		}
	
		
//printing ele usingfor each loop displaying elemensts from given array
//		int[] arr = {10,20,30,40,50};
//		for(int a:arr) {
//			System.out.print(a + " ");
//		}
		
		
		
//taking elements from user and displaying array
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size : ");
//		int size = sc.nextInt();
//		System.out.println("Enter elements : ");
//		int arr[] = new int[size];
//		for(int i = 0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//			System.out.print(arr[i] + " ");
//		}
		
		
//display ele3mts in  reverse
//		int[] arr = {10,20,30,40,50};
//		for(int i=arr.length-1;i>=0;i--) {
//			
//			System.out.print(arr[i] + " ");
//		}

		
//sum of array elements
//		int arr[] = {10,20,30,40,50};
//		int sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			
//			sum +=arr[i];
//		}
//		System.out.println(sum);
		
		
		
//Greatest of all elements
//		Scanner  sc =new Scanner(System.in);
//		System.out.print("Enter size: ");
//		int n = sc.nextInt();
//		System.out.print("Enter elements : ");
//		int[] arr =new int[n];
//		int max = 0;
//		for(int i =0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		    if(arr[i]>max) {
//		    	max = arr[i];
//		    }
//		}
//		System.out.println(max);

		
//Maximum ele in given array
//		int[] arr = {10,20,30,40,50};
//		int max = arr[0];
//		int min = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}else {
//				min=arr[i];
//			}
//		}
//		System.out.println("Maximum Element is: "+max);
//		System.out.println("Minimum Element is :"+min);

		
//Min num		
//		Scanner  sc =new Scanner(System.in);
//		System.out.print("Enter size: ");
//		int n = sc.nextInt();
//		System.out.print("Enter elements : ");
//		int[] arr =new int[n];
//		int min = Integer.MAX_VALUE;
//		for(int i =0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		   if(arr[i]<min) {
//		    min = arr[i];
//		    }
//		}
//		System.out.println(min);

		
//SecondLargest ele
//		int[] arr = {50,20,70,40,90};
//		int max =arr[0];
//		int Smax=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max){
//				Smax=max;
//				max=arr[i];			
//			}
//			else if(arr[i]<max && arr[i]>Smax) {
//				Smax =arr[i];
//			}
//		}
//		System.out.println("Second Largest element is: " +Smax);
		
		
//Finding max num using sortmethod
//		int[] arr = {10,20,30,40,50};
//		Arrays.sort(arr);		
//			System.out.println("Maximum num is :"+arr[arr.length]);

		
//Array sort
//		int[] arr = {50,20,70,40,90};
//		Arrays.sort(arr);
//		for(int i = 0;i<arr.length;i++) {
//			System.out.print(arr[i] +" ");
//		}
		
//Arrays sort in rev
//		int[] arr = {10,20,30,40,50};
//		Arrays.sort(arr);
//		for(int i = arr.length-1;i>=0;i--) {
//			System.out.print(arr[i] +" ");
//		}
		
		
//Duplicates
//		int[] arr = {10,20,30,40,30};
//		for(int i=0;i<=arr.length;i++) {
//			for(int j = i+1;j<=arr.length-1;j++) {
//				if(arr[i] == arr[j]) {
//					System.out.print(arr[i] + " ");
//				}
//			}
//		}
		
//First and last Element
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=in.nextInt();
//					if(i==0||i==n-1)
//					{
//						System.out.print(arr[i]+" ");
//					}
//		}
		
//				int sum=0;
//				for(int i=0;i<arr.length;i++)
//				{
//					sum=sum+arr[i];
//				}
//				double average=(double)sum/arr.length;
//				System.out.println("Sum is:"+sum);
//				System.out.println("Average is:"+average);
		//Sum of ele at even position in array
//				int sum=0;
//				for(int i=0;i<arr.length;i++)
//				{
//					if(i%2==0)
//					{
//						sum=sum+arr[i];
//					}
//				}
//				System.out.println(sum);
		//Reverse array
//				for(int i=n-1;i>=0;i--)
//				{
//					System.out.print(arr[i]+" ");
//				}		

//Even or odd
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter size of array : ");
//		int n = sc.nextInt();
//		System.out.print("Enter elements : ");
//		int[] arr = new int[n];
//		for(int i=0;i<=arr.length-1;i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i] %2 == 0) {
//				System.out.println("It is Even number");
//			}else {
//				System.out.println("It is odd number");
//			}
//		}
		

		
//Prime
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Size of an array is :");
//		int n = sc.nextInt();
//		System.out.println("Elements are : ");
//		int[] arr = new int[n];
//		for(int i=0;i<=arr.length-1;i++) {
//			arr[i] = sc.nextInt();
//			int count =0;
//			for(int j=1;j<=arr[i];j++) {
//				if(arr[i] % j == 0) {
//					count++;
//				}
//			}
//			
//				if(count==2) {
//					System.out.print(arr[i] + " ");
//				}
//			
//		}
		
//Unique elements
//		boolean flag;
//		int[] arr = {10,10,30,20,30,40,50};		
//		for(int i=0;i<arr.length;i++) {
//			flag = true;
//			for(int j = 0;j<arr.length;j++) {
//				if(i !=j && arr[i] == arr[j]) {
//					flag = false;					
//					
//				}
//			}
//				if(flag==true)
//				System.out.print(arr[i] + " ");
//		}
		
		
//Fibanocci
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of terms: ");
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        a[0] = 0;
//        a[1] = 1;
//        for (int i = 1; i <= n; i++) {
//            a[i] = a[i - 1] + a[i - 2];
//        }
//        System.out.println("Fibonacci Series:");
//        for (int i = 0; i <n; i++) {
//            System.out.print(a[i] + " ");
//        }
					
		
		
/*Insertion – Reverse direction
Start from the last index and move towards the position.
4 → 3 → 2 → 1
Deletion – Forward direction
Start from the deleted position and move towards the last index.
1 → 2 → 3 → 4
*/
		
		
//Inserting an ele

		
//		int arr[]= {10,30,40,50,60};
//		int position = 1;
//		int value = 20;
//		System.out.println(Arrays.toString(arr));
//		for(int i = arr.length-1;i>position;i--) {
//			 arr[i] = arr[i-1];
//			 System.out.println(Arrays.toString(arr));
//		}
//		
//		arr[position]=value;
//		System.out.println(Arrays.toString(arr));
		
//		int[] arr = {5,10,15};
//		System.out.println(arr[arr.length]);

		
}

}
