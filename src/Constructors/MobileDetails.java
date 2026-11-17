package Constructors;

public class MobileDetails {
	int Mobile_ID;
	String Brand;
	String Model;
	double  Price;

	public MobileDetails() {
		Mobile_ID = 1001;
		Brand     = "Samsung";
		Model     = "Galaxy A35";
		Price     = 28000.0;
	}
	public MobileDetails(int Mobile_ID,String Brand,String Model,double  Price) {
		this.Mobile_ID = Mobile_ID;
		this.Brand = Brand;
		this.Model=Model;
		this.Price = Price;
	}
	 public MobileDetails(MobileDetails m3)	{
		this.Mobile_ID = m3.Mobile_ID;
		this.Brand = m3.Brand;
		this.Model=m3.Model;
		this.Price = m3.Price;
	}
	
	public void display() {
		System.out.println("Mobile ID : " +Mobile_ID );
		System.out.println("Brand : " +Brand);
		System.out.println("Model : " +Model);
		System.out.println("Price : " +Price);

	}
	
	public static void main(String[] args) {
		MobileDetails m1 = new MobileDetails();
		MobileDetails m2 = new MobileDetails(1002,"One Plus"," Nord CE 5", 24999.0);
		MobileDetails m3= new MobileDetails(m2);
		
		
		System.out.println("================== MOBILE DETAILS ==================\n");
		System.out.println("Mobile 1 (Default Constructor)");
		System.out.println("-----------------------------");
		m1.display();
		System.out.println("\nMobile 2 (Parameterized Constructor)");
		System.out.println("-----------------------------------");
		m2.display();
		System.out.println("\nMobile 3 (Copy Constructor)");
		System.out.println("---------------------------");
		m3.display();
		
		System.out.println("\n====================================================");
		System.out.println("After Updating the Price of Mobile 3");
		System.out.println("====================================================");
		System.out.println("\nMobile 2 Details");
		System.out.println("------------------");
		m2.display();
		System.out.println("\nMobile 3 Details");
		System.out.println("------------------");
		m3.Price = 23000.0;
		m3.display();
	}

}
