package operators;

public class Unary_Operators {

	public static void main(String [] args) {
        //int a = 5;
        //int b = a++ + a++ + ++a;

        //int a = 20; 
        //int b = ++a - a-- + a++ - --a ;
        

        //int a =  43;
        //int b = --a + a++ - a-- + a++ - ++a - a-- + ++a;

        //int a = 25;
        //int b = a++ + ++a - a-- + --a + a++;
      
        //int a = 36;
        //int b = --a + a++ - ++a + a-- - --a;

        int a = 18;
        int b = a++ - --a + ++a + a-- - a++ + --a;
 
        System.out.println(b);
    }

}
