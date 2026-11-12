package Arrays;

public class TwoDimen {

//Acessing individual ele
        public static void main(String[] args) {
        	
//		int[][] arr = new int[3][2];
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[1][0] = 30;
//		arr[1][1] = 40;
//		arr[2][0] = 50;
//		arr[2][1] = 60;
//		System.out.println(arr[2][0]);
	
	
//using for loop
//        	int[][] arr = {{10,20,30},
//        	               {40,50,60},
//        	               {76,98,86};
//        	for(int i=0;i<arr.length;i++) {
//        		for(int j = 0;j<arr[i].length;j++) {
//        			System.out.print(arr[i][j] + " ");
//        		}
//        		System.out.println(" ");
//        	}
        	
// 3 students marks in 3 subjs
//        	int[][] marks= {{80,90,30},{90,95,100}{98,87,56}};
//        	for(int i=0;i<marks.length;i++) {
//        		int total = 0;
//        		
//        		for(int j =0;j<marks[i].length;j++) {
//        			total = total+marks[i][j];
//        		}
//        		System.out.println("Student " +(i+1)+ " total marks :" +total );
//        		
//        	}
  
        	
//sum
//        	int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
//        	for(int i=0;i<arr.length;i++) {
//        		int sum =0;
//        		for(int j=0;j<arr[i].length;j++) {
//        			sum = sum +arr[i][j];
//        		}
//        		System.out.println(sum);
//        	}
        	
 
//Movei tickets
//        	int[][] arr = {{1,0,1,1},{1,1,0,1},{0,1,1,1}};
//        	for(int i=0;i<arr.length;i++) {
//        		for(int j=0;j<arr[i].length;j++) {
//        			if(arr[i][j]==1) {
//        				System.out.print("Booked" + "     ");
//        			}else {
//        				System.out.print("Available" + "  ");
//        			}
//        		}
//        		System.out.println(" ");
//        	}
        	
        	
//Column-wise Sum
//           int[][] arr = {
//         		              {10, 20, 30},
//         		              {40, 50, 60},
//         		              {70, 80, 90}
//         		             };
// 
//            for(int i =0;i<arr.length;i++) {
//            	int sum =0;
//         	   for(int j = 0;j<arr.length;j++) {
//         		   sum = sum + arr[j][i];
//         	   }System.out.println("Total Sum of Column" +i+ " is : " +sum);
//            } 
        	
        	
//Sum of Primary Diagonal Elements
//        	int[][] arr = {{10, 20, 30},
//        			       {40, 50, 60},
//        			       {70, 80, 90}};
//    		int sum=0;
//    		for(int i=0;i<arr.length;i++)
//    		{
//    			sum=sum+arr[i][i];
//    		}
//    		System.out.println("Sum of Diagonal elements is "+sum);
    		
    		
    		
//Transpose
        	int[][] arr = {{10,20,30},
                       
                       {76,98,86}};
         for(int i=0;i<arr[0].length;i++) {
	     for(int j = 0;j<arr.length;j++) {
		System.out.print(arr[j][i]+" ");
	}
	    System.out.println();
}
       
        }	
}
