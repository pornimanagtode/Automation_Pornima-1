package nested_loop_patterns;

public class Floyds_triangle {

	public static void main(String[] args) {
		//rows 6 and columns 6
		int v = 1;
		for(int p = 1; p<=6; p++) {
			for(int q = 1;q<=p; q++) {
				System.out.print(v+" ");
				v++;
			}
			System.out.println();
		}

	}

}
