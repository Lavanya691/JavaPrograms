package Oops;

public class EmployeeInformation {

	int empid;
	String empname;
	int salary;
	static String companyName = "ABC Technologies";
	
    //static method
	static {
		System.out.println("Company Information Loaded\n");
	}
	
   //instance
	{
		System.out.println("Employee Object Created");
	}
	
	public static void main(String[] args) {
		EmployeeInformation emp1 = new EmployeeInformation();
		EmployeeInformation emp2 = new EmployeeInformation();
		EmployeeInformation emp3 = new EmployeeInformation();
		
		emp1.empid =1;
		emp1.empname = "Lavs";
		emp1.salary = 80000;
		
		emp2.empid =2;
		emp2.empname = "Kavya";
		emp2.salary = 70000;
		
		emp3.empid =3;
		emp3.empname = "Jaan";
		emp3.salary = 60000;
		
		System.out.println("\nCompany : " +companyName );
		System.out.println("\nEmployee 1 ");
		System.out.println("ID : " + emp1.empid);
		System.out.println("Name : " + emp1.empname);
		System.out.println("Salary : " + emp1.salary);
		
		System.out.println("\nEmployee 2 ");
		System.out.println("ID : " + emp2.empid);
		System.out.println("Name : " + emp2.empname);
		System.out.println("Salary : " + emp2.salary);
		
		System.out.println("\nEmployee 3 ");
		System.out.println("ID : " + emp3.empid);
		System.out.println("Name : " + emp3.empname);
		System.out.println("Salary : " + emp3.salary);



	}

}
