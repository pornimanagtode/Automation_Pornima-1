package jump_statement;

public class Test {
	int a;
	public void login (int b) {
		a=b;
		System.out.println("the value of variable a is "+b);
	
	}
	public static void main(String[] args) {
		Test p = new Test();
		p.login(5);

	}

}
