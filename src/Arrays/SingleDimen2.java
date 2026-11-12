package Arrays;

import java.util.Arrays;

public class SingleDimen2 {

	public static void main(String[] args) {

		
//Move all zeroes to end
//		int[] a = {3, 5, 0, 2, 3, 0};
//		int j = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] != 0) {
//				a[j] = a[i];
//				j++;
//				}
//			}
//		while (j < a.length) {
//			a[j] = 0;
//			j++;
//			}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

//Method2 - Swapping 
//		int[] a = {3, 5, 0, 2, 3, 0};
//		int j=0;
//		for(int i=0;i<a.length;i++){
//			if(a[i] != 0) {
//				int temp = a[i];
//				a[i] = a[j];
//				a[j] = temp;
//				j++;
//			}
//		}
//		for(int i =0;i<a.length;i++) {
//			System.out.print(a[i] + " ");
//		}
			
		
//moving front	 - Swapping method	
//		int[] a = {3, 5, 0, 2, 3, 0};
//		int j=0;
//		for(int i=0;i<a.length;i++){
//			if(a[i] == 0 ) {
//				int temp =a[i];
//				a[i] = a[j];
//				a[j]=temp;
//				j++;
//			}
//			
//		}
//		for(int i =0;i<a.length;i++) {
//			System.out.print(a[i] + " ");
//		}
		
//Without Swapping method 
//		int[] a = {3, 5, 0, 2, 3, 0};
//		int j=0;
//		for(int i=0;i<a.length;i++){
//			if(a[i] == 0 ) {
//				j++;
//			}
//			}
//		int k = a.length-1;
//		for(int i=k;i>=0;i--){
//			if (a[i] != 0) {
//		        a[k] = a[i];
//		        k--;
//		}
//		}
//		for (int i = 0; i < j; i++) {
//		    a[i] = 0;
//		}
//		for(int i =0;i<a.length;i++) {
//			System.out.print(a[i] + " ");
//		}

		
//Moving all positives to end  M-1
//		int[] a = {2,-5,6,7,0,-1};
//		int j=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i] <=0) {
//				int temp =a[i];
//				a[i] = a[j];
//				a[j] = temp;
//				j++;
//			}
//		}
//		for(int i =0;i<a.length;i++) {
//			System.out.print(a[i]  + " ");
		
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

		
//Average 		
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
	

		
	}
}

