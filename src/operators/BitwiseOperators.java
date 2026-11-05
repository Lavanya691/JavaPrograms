package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 5, b = 3;
		System.out.println("BITWISE AND : " +(a&b));
		System.out.println("BITWISE OR : " +(a|b));
		System.out.println("BITWISE XOR: " +(a^b));
		System.out.println("BITWISE NOT : " +(~a));
		System.out.println("Left Shift of 5<<1 : " +(a << b));
		System.out.println("Right Shift of 5>>1 : " +(a >> b));

	}

}
