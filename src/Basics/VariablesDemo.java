package Basics;

public class VariablesDemo {

// Local variable : A variable declared inside a method, constructor, or block is a local variable.
//	void display() {
//        int age = 21;  // Local variable
//
//        System.out.println(age);
//    }
//
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.display();
//    }
	

/*age is declared inside the display() method.
  We can access age only inside that method.
  We cannot directly access it from another method.
  */

	
// Instance variable : A variable declared inside a class but outside methods is an instance variable.

	int age = 21;  // Instance variable

    void display() {
        System.out.println(age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.display();
        s2.display();
    }
	    
}