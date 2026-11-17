package ConstructorChaining;
public class Task1 {
	int pid;
	String pname;
	String disease;
	double bill_amt;
	public Task1() {
		this(101,"Rahul","Fever",2500);
		System.out.println("Patient Registration Started");
	}
	public Task1(int pid,String pname,String disease,double bill_amt) {		
		this.pid = pid;
		this.pname = pname;
		this.disease = disease;
		this.bill_amt = bill_amt;		
	}
	public void display() {
		System.out.println("Patient ID :" +pid);
		System.out.println("Patient Name : " + pname);
		System.out.println("Disease : " +disease);
		System.out.println("Bill Amount : " +bill_amt);
	}
	public static void main(String[] args) {
	Task1 t1 = new Task1();
	t1.display();
	}
}
