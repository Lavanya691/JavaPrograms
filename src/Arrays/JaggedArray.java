package Arrays;

public class JaggedArray {

	public static void main(String[] args) {
    	int[][] arr = { 
    			       {10,20},
    			       {40,50,60},
    			       {76,98,86,98}
    			       };
    	for(int i=0;i<arr.length;i++) {
    		for(int j = 0;j<arr[i].length;j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println(" ");

	}

}
}
