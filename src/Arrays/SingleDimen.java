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
		

		
//		Scanner  sc =new Scanner(System.in);
//		System.out.print("Enter size: ");
//		int n = sc.nextInt();
//		System.out.print("Enter elements : ");
//		int[] arr =new int[n];
//		int min = Integer.MAX_VALUE;
//		for(int i =0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		    if(arr[i]<min) {
//		    min = arr[i];
//		    }
//		}
//		System.out.println(min);
		
//Array sort
//		int[] arr = {10,20,30,40,50};
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
		int[] arr = {10,10,30,20,30,40,50};		
		for(int i=0;i<arr.length;i++) {
			boolean flag = true;
			for(int j = 0;j<arr.length;j++) {
				if(i !=j && arr[i] == arr[j]) {
					flag = false;
					break;
					
				}
			}
				if(flag)
				System.out.print(arr[i] + " ");
		}		
//Fibanocci
//		System.out

		
}

}
