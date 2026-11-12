package Constructors;

public class WithConstructor {
	
	public WithConstructor() {
		System.out.println("I am default constructor");
	}
    
	public WithConstructor(int pid) {
		System.out.println("product id:"+pid);
	}
	public WithConstructor(double pid) {
		System.out.println("product price:"+pid);
	}
	public WithConstructor(boolean isAvailability,int quantity,String pname) {
		System.out.println("Available : "+isAvailability);
		System.out.println("Quantity : "+quantity);
		System.out.println("Product name: "+pname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WithConstructor p1=new WithConstructor();
		WithConstructor p2=new WithConstructor(500);
		WithConstructor p3=new WithConstructor(true,6,"Soap");
		
		

	}

}
