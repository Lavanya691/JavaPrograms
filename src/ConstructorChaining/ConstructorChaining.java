package ConstructorChaining;

public class ConstructorChaining {
		int pid;
		String name;
		double price;		
		public ConstructorChaining() {
			this(102,"mobile",10000);
			System.out.println("default constructor");
		}
		public ConstructorChaining(int pid, String name, double price) {
			this(103,"charger");
			this.pid=pid;
			this.name=name;
			this.price=price;
			System.out.println("three parameterized constructor");
		}
		public ConstructorChaining(int pid,String name) {
			System.out.println("2 parameterized constructor");
		}
		public void display() {
			System.out.println(pid+" "+name+" "+price);
		}
		public static void main(String[] args) {			
			ConstructorChaining obj=new ConstructorChaining();
			obj.display();

		}

	}
