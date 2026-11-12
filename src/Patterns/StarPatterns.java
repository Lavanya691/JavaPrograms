package Patterns;

public class StarPatterns {

	public static void main(String[] args) {
		
//ABCD
//		for(char i = 'A';i<='D';i++) {
//			for(char j='A';j<='D';j++) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
//		}
		
//DDDD CCCC BBBB AAAA
//		for(char i = 'D';i>='A';i--) {
//			for(char j='D';j>='A';j--) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
//		}
		
		
//DCBA
//			for(char i = 'D';i>='A';i--) {
//			for(char j='D';j>='A';j--) {
//				System.out.print(j+ " ");
//			}
//			System.out.println();
//		}
		

//* 4 X 4 		
//for(int i = 1;i<=4;i++) {
//	for(int j = 1;j<=4;j++) {
//		System.out.print("*" + " ");
//	}
//	System.out.println();
//}
	
//right triangle
/* *
   * *
   * * *
 */	
//		for(int i = 1;i<=4;i++) {
//		for(int j =1;j<=i;j++) {
//			System.out.print("*" + " ");
//		}
//		System.out.println("  ");
//	}

//Reverse right triangle
	/*  * * * * 
		* * * 
		* * 
		* 
	*/
				
//		for(int i = 1;i<=4;i++) {
//			for(int j =4;j>=i;j--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}

		
/*		
*   
* *   
* * *   
* * * *   
* * * * 
* * * 
* * 
*
*/
//		for(int i = 1;i<=4;i++) {
//		for(int j =1;j<=i;j++) {
//			System.out.print("*" + " ");
//		}
//		System.out.println("  ");
//	}	
//		for(int i = 1;i<=4;i++) {
//		for(int j =4;j>=i;j--) {
//			System.out.print("*" + " ");
//		}
//		System.out.println();
//	}
		
		
		
/*		
* - - - 
- * - - 
- - * - 
- - - * 
*/
//		int n =4;
//		for(int i = 1;i<=n;i++) {
//			for(int j =1;j<=n;j++) {
//				if(i == j) {
//				System.out.print("*" + " ");
//				}
//				else {
//					System.out.print("-" + " ");
//				}
//			}
//			System.out.println();
//		}
		
//
//		int n = 4;
//		int sp =0;
//		int st = n;
//		for(int i =0;i<st;i++) {
//			
//			st--;
//			System.out.print("*" +" ");
//		}
//		for(int j=0;j>sp;j++) {
//			
//			sp++;
//			System.out.print(" "  );
//		}
//		System.out.println();
	
		
		
	}

}
