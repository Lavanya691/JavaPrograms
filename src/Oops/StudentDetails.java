package Oops;

public class StudentDetails {
	
	int id;
	String name;
	String course;
	
	//static bolck
	static {
		System.out.println("Student Management System Started");
	}
	
    //	Instance block
	{
	System.out.println("Student Object Created"); // It executes automatically whenever you create a new object.
	}	

	public static void main(String[] args) {
		
        // Student 1		
		StudentDetails s1 = new StudentDetails();
		s1.id = 1;
		s1.name = "Lavanya";
		s1.course = "JFS";
		
        // Student2
		StudentDetails s2 = new StudentDetails();
		s2.id = 2;
		s2.name = "Pooja";
		s2.course = "Cloud";
		
		System.out.println("\nStudent 1 ");
		System.out.println("ID : " + s1.id);
		System.out.println("Name : " + s1.name);
		System.out.println("Course : " + s1.course);
		
		System.out.println("\nStudent 2");
		System.out.println("ID : " + s2.id);
		System.out.println("Name : " + s2.name);
		System.out.println("Course : " + s2.course);

	}

}
