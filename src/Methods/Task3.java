package Methods;

import java.util.Scanner;

public class Task3 {
	
	String[] menu = {"Panner Biryani","Biryani","Dal","Rice","Curd"};
	 int quantity;
	 double price;
	 double bill;
     double discount;
     double finalBill;
     String item;
	Scanner sc = new Scanner(System.in);
	public void displayMenu() {
		System.out.println("=================MENU WE ARE PROVIDING==================");

		for(int i=0;i<menu.length;i++) {
		System.out.println(menu[i]);
		}
	}
	public double calculateBill() {
		
        double bill = quantity * price;
        return bill;
		
	}
	public double calculateDiscount(double bill) {
	    double discount = 0;
	    if (bill > 1000) {
	        discount = bill * 0.10;
	    }
	    return discount;
	}
	public void printBill() {
       finalBill = bill - discount;
        System.out.println("\n========= FINAL BILL =========");
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: Rs." + price);
        System.out.println("Total Bill: Rs." + bill);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Bill: Rs." + finalBill);
    }

	public static void main(String[] args) {
		Task3 t = new Task3();
		t.displayMenu();

        System.out.print("Enter Quantity: ");
        t.quantity = t.sc.nextInt();

        System.out.print("Enter Price: ");
        t.price = t.sc.nextDouble();

        t.bill = t.calculateBill();

        t.calculateDiscount(t.bill);

        t.printBill();

	}

}
