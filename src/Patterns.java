
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1234
//        //rows
//		for(int i=1;i>=4;i++) {
//			for(int j = 1;j<=4;j++) {
//				System.out.print(i+" ");
////				System.out.print(j+" ");
//			}
//			//for newline
//			System.out.println( );
//		}
 
 
//reverse 4444, 33333
//		for(int i = 4;i>=1;i--) {
//			for(int j = 1;j<=4;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
//ABCD
//		for(char i = 'A';i<='D';i++) {
//			for(char j='A';j<='D';j++) {
//				System.out.print(i+ " ");
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
		for(int i = 1;i<=4;i++) {
			for(int j =4;j>=i;j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		


	}

}
