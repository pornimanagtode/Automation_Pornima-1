package operator;

public class Arithmatic_operator {

	public static void main(String[] args) {
		System.out.println("Addition");
		byte a= 23;
		short b=40;
		long c=a+b;
		System.out.println("value of c is: "+c);
		
		long d= 40;
		int e= 4;
		long f= d+e;
		System.out.println("value of f is: "+f);
		
		System.out.println("------------------------");
		System.out.println("subtraction");
		 int h= 23;
		 int i= 34;
		long j = h+i;
		System.out.println("value of j is: "+j);
		System.out.println("-----------------------");
		System.out.println("Multiplication");
		int l= 46;
		int s = 50;
		long t= l+s;
		System.out.println("the value of t is: "+t);
		System.out.println("-----------------------");
		System.out.println("Division");
		float m= 55.34f;
		double n= 44.56;
		byte x = (byte) (m%n);
		System.out.println(x);
		System.out.println("-----------------------");
		System.out.println("increment");
		int w=80;
		System.out.println(++w);
		System.out.println("-----------------------");
		System.out.println("decrement");
		byte q= 50;
		System.out.println(--q);
		
		}

}
