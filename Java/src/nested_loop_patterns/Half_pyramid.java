package nested_loop_patterns;

public class Half_pyramid {

	public static void main(String[] args) {
		// Half pyramid
		// rows 5 AND Columns 5
		for ( int a = 1; a<=5; a++) {
			for( int b =1; b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
