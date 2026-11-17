package Constructors;

public class DefaultConst {

	
	int eid;
	String ename;
	static String deptname;

	static {
		System.out.println("static block ");
	}
	
	{
		System.out.println("Instance block ");
	}
	DefaultConst(){
		System.out.println("default Constructor");
	}
	
	public static void main(String [] args) {
		DefaultConst d1 = new DefaultConst();
	}
}