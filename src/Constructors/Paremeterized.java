package Constructors;

public class Paremeterized {
	//creating object at the same time assigning values
	int eid;
	String ename;
	static String deptname;
	
	public Paremeterized(){
		
	}
    public Paremeterized(int eId,String eName ){
		eId = eid;
		eName = ename;
	}
	public void display(){
		System.out.println("eid: " +eid);
		System.out.println("ename : " +ename);
	}

	public static void main(String[] args) {
		Paremeterized p1 = new Paremeterized();

		Paremeterized p2 = new Paremeterized(1,"Lavs");
		p1.display();
		p2.display();
	}

}
