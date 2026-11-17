package Oops;

public class Employee {

//	int eid;
//	String ename;
//	static String deptname;
//
//	static {
//		deptname = "java";
//		System.out.println("static block is executed");
//	}
//	
//	{
//		System.out.println("Instance block is executed");
//		System.out.println("Registration is Started");
//	}
//	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		
//		e1.eid = 1;
//		e1.ename = "Lavs";
//		System.out.println(e1.eid + " " + e1.ename + " " + deptname);
//		
//		Employee e2 = new Employee();
//		e2.eid = 2;
//		e2.ename = "Ram";
//		System.out.println(e2.eid + " " + e2.ename + " " + deptname);
//		
//		Employee e3=e2;
//		System.out.println(e3.eid + " " + e3.ename + " " + deptname);
//		e3.eid = 3;
//		e3.ename = "Sam";
//		System.out.println(e2.eid + " " + e2.ename + " " + deptname);
//		System.out.println(e3.eid + " " + e3.ename + " " + deptname);
//	}

	
	int eid;
	String ename;
	static String deptname;

	static {
		System.out.println("static block ");
	}
	
	{
		System.out.println("Instance block ");
	}
	Employee(){
		System.out.println("default Constructor");
	}
	
	public void name() {
		
		
	}
}
