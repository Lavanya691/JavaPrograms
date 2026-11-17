package ConstructorChaining;

public class Task2 {
	

	int Order_ID ;
	String Restaurant;
	String Food_Item;
	String Delivery_Address;
	
	public Task2() {
		this( "Chicken Biryani", "Hyderabad");
		System.out.println("Food Order Started");
	}
	
    public Task2(String Food_Item,String Delivery_Address) {
		this(1001, "Paradise");
		this.Food_Item = Food_Item;
		this.Delivery_Address = Delivery_Address;
	}
	public Task2(int Order_ID,String Restaurant) {
		this.Order_ID =Order_ID ;
		this.Restaurant = Restaurant;
	}
   
    
	public void display() {
		System.out.println("Order ID :" +Order_ID);
		System.out.println("Restaurant :" + Restaurant);
		System.out.println("Food Item :" + Food_Item);
		System.out.println("Delivery Address : " + Delivery_Address);
	}
	public static void main(String[] args) {
		Task2 t1 = new Task2();
		t1.display();
		

	}

}
