package Methods;

public class BankAcc {

	double amt = 500;
	double bal = 1000;
	//no parameter with return type 
	public double checkBalance() {
		System.out.println("Your Balance is : ");
		return bal;
	}
	//with parameter no return type
	public void deposit(double amt) {
		
		bal = bal+amt;
		System.out.println("deposit Successfully");

	}
	//with parameter with return type
	public double withDraw(double amt) {
		bal = bal - amt;
		return bal;
	}
	//No parameter no return type
	public void welcome() {
		System.out.println("Welcome to bank");
	}
	
	public static void main(String[] args) {
		BankAcc b = new BankAcc();
		b.welcome();
		
		//b.checkBalance();//it wont print balce
		
//		double balance = b.checkBalance();
//		System.out.println(b.checkBalance());
//		b.deposit(3000);
		System.out.println(b.withDraw(100));
	}

}
