package Methods;

public class FoodOrder {

	int Order_ID;
	String Customer_Name;
	String Restaurant_Name;
	String Food_Item;
	int Quantity;
	double Price_per_Item;
	
	double bill;
	double delivery_charge;
	double discount;
	double final_bill;
	
	public double totalbill() {
		bill = Quantity *Price_per_Item;
		return bill;
	}
    public double discountGot() {
    	if(bill>1000) {
    		discount = (bill*15)/ 100;
    	}
		return discount;
    }
	public double deliveryCharge() {
		if(bill<500 && bill>0) {
    		delivery_charge = 50;
    	}else {
    		delivery_charge = 0;
    	}
		return delivery_charge;
	}
	
    public double FinalBill() {
		final_bill = bill-discount+delivery_charge;
		return final_bill;
	}
	public FoodOrder(int Order_ID,String Customer_Name,String Restaurant_Name,
			         String Food_Item,int Quantity,double Price_per_Item) {
		this.Order_ID = Order_ID;
		this.Customer_Name = Customer_Name;
		this.Restaurant_Name = Restaurant_Name;
		this.Food_Item= Food_Item;
		this.Quantity = Quantity;
		this.Price_per_Item = Price_per_Item;
		
	}
	
	
	public void display() {
		 totalbill();
		 discountGot();
		 deliveryCharge();
	     FinalBill();
	    
		System.out.println("Order ID is : " +Order_ID);
		System.out.println("Customer Name is : " +Customer_Name);
		System.out.println("Restaurant Name is : " + Restaurant_Name);
		System.out.println("Food Item is : " +Food_Item);
		System.out.println("Quantity is : "+ Quantity);
		System.out.println("Price_per_Item is : " + Price_per_Item);
		
		System.out.println("\n------------------------------------------\n");
		System.out.println("Total Bill: Rs." + bill);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Delivery Charge: Rs." + delivery_charge);
        System.out.println("Final Bill: Rs." + final_bill);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder c1= new FoodOrder(101,"Lavs","Dominos","Pizza",2,180);
		FoodOrder c2= new FoodOrder(102,"Sam","Paradise","Mandi",3,800);
		FoodOrder c3= new FoodOrder(103,"Raj","Mehfil","Biryani",5,180);
		
		
		System.out.println("\n========== FOOD ORDER DETAILS OF CUSTOMER 1 ==========");
		c1.display();
		System.out.println("\n========== FOOD ORDER DETAILS OF CUSTOMER 2==========");
		c2.display();
		System.out.println("\n========== FOOD ORDER DETAILS OF CUSTOMER 3 ==========");
		c3.display();
		

	}

}
