package Constructors;

public class LaptopInventory {

	String brand;
	String model;
	int price;
	
	public LaptopInventory(String brand,String model,int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public LaptopInventory(LaptopInventory l1) {
		this.brand = l1.brand;
		this.model = l1.model;
		this.price = l1.price;
	}
	public void display() {
		System.out.println("Brand : " +brand);
		System.out.println("Model : " +model);
		System.out.println("Price : "+price);
	}

	public static void main(String[] args) {
		LaptopInventory l1 = new LaptopInventory("Dell","Inspiron 15",62000);
		LaptopInventory l2 = new LaptopInventory(l1);
		System.out.println("Laptop1\n");
		l1.display();
		System.out.println("\nLaptop2 \n");
		l2.display();
	}

}
