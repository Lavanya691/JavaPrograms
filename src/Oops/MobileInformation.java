package Oops;

public class MobileInformation {

	//Instance variables
	String model;
	int price;
	String color;

	//static variables
	static String brand = "Samsung";
	
	//static block
	static {
		System.out.println("Mobile Store Opened\n");
	}
	
	//Instance block
	{
		System.out.println("Mobile Object Created");
	}
	
	public static void main(String[] args) {
		MobileInformation m1 = new MobileInformation();
		MobileInformation m2 = new MobileInformation();
		
		m1.model = "Galaxy A55";
		m1.price = 35000;
		m1.color = "Black";
		
		m2.model = "Galaxy S24";
		m2.price = 75000;
		m2.color = "Blue";
		
		System.out.println("\nBrand : " +brand );
		System.out.println("\nMobile 1");
		System.out.println("Model : " +m1.model);
		System.out.println("Price : " +m1.price);
		System.out.println("Color : " +m1.color);
		
		System.out.println("\nMobile 2");
		System.out.println("Model : " +m2.model);
		System.out.println("Price : " +m2.price);
		System.out.println("Color : " +m2.color);

		
	}

}
