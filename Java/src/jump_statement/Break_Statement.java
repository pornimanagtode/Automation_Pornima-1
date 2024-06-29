package jump_statement;

public class Break_Statement {

	public static void main(String[] args) {
		for (int a = 20; a >= 1; a--) {
			System.out.print(a+"");
			{
				if (a == 15) {
					break;
				}
			}
		}
		System.out.println();
		System.out.println("------------------------------");

		int b = 30;
		while (b >= 1) {
			System.out.print(b + " ");
			if (b == 20) {
				break;
			}
			b--;
		}
		System.out.println();
		System.out.println("------------------------------");
		int c = 35;
		do {
			System.out.print(c + " ");
			if (c == 25) {
				break;
			}
			c--;
		} while (c >= 1);

		System.out.println();
		System.out.println("---------------------");

	}

}
