package loop_statement;

public class Nested_loop {

	public static void main(String[] args) {
		for(int a = 40;a<=45;a++) {
			System.out.println("the value for outer loop is :"+a);
			for(int b = 40; b<43;b++) {
				System.out.println(b);
			}
		}

	}

}
