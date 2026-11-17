package Constructors;

public class CopyConstructor {

 
			int pid;
			String name;
			double price;
		public CopyConstructor(int pid,String name,double price)
			{
				this.pid=pid;
				this.name=name;
				this.price=price;
			}
		public CopyConstructor(CopyConstructor p1)
			{
				this.pid=p1.pid;
				this.name=p1.name;
				this.price=p1.price;
				
			}
		void display()
			{
				System.out.println(pid+" "+name+" "+price);
			}
		public static void main(String[] args) {
				CopyConstructor p = new CopyConstructor(1323,"MAcBook",100000);
				CopyConstructor p1 = new CopyConstructor(p);
				p.display();
				p1.display();
				
			}
		}		

