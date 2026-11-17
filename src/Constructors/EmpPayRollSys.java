package Constructors;

public class EmpPayRollSys {
	int empId;
	String empName;
	String department;
	int salary;
	
//	parameterized const
	public EmpPayRollSys(int i,String n,String d,int s) {
		empId = i;
		empName = n;
		department = d;
		salary = s;
	}
	
	void display(){
		System.out.println("Employee ID : " +empId);
		System.out.println("Name : " +empName);
		System.out.println("Department  : " +department);
		System.out.println("Salary  : " +salary);		
}

	public static void main(String[] args) {
		EmpPayRollSys e1 = new EmpPayRollSys(101,"Ravi","HR",35000);
		EmpPayRollSys e2 = new EmpPayRollSys(102,"Priya","Developer",55000);
		EmpPayRollSys e3 = new EmpPayRollSys(103,"Kiran","Testing",42000);
		e1.display();
		System.out.println();
		e2.display();
		System.out.println();
		e3.display();
		System.out.println();
	}

}
