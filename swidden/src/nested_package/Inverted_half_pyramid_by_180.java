package nested_package;

public class Inverted_half_pyramid_by_180 {

	public static void main(String[] args) {
		//rows 5 and columns 5
		
		for(int i = 1; i<=5; i++) {
			// to pirnt space
			for(int j = 1; j<=5-i;j++) {
				System.out.print("  ");
			}
			// to print star
			for(int k = 1; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
