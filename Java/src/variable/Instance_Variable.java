package variable;

public class Instance_Variable {
int a = 20;
float b = 25.9f;
byte c = 56;

public void stp(){
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
	
	public static void sum() {
		Instance_Variable sum = new Instance_Variable();
		System.out.println( sum.b);
	}
	
	public static void main(String[] args) {
		Instance_Variable sum = new Instance_Variable();
		sum.stp();
		
		
	}

}
