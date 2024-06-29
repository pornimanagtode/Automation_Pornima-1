package decision_making_statement_in_Java_CS;

public class Nested_if_statement {

	public static void main(String[] args) {
		long a = 250;
		if (a > 100) {
			System.out.println(" the value of a is greater than 100");
			if (!(a == 250)) {
				System.out.println("The value of a is not equals to 250");
				if (a > 400) {
					System.out.println("The value of a is greater than 400");

				}
			}

		} else {
			System.out.println("execute the script");
		}
		System.out.println("-------------------------------------");

		if (a < 500) {
			System.out.println("the value of a is less than 500");
			if (a > 195)
				System.out.println("the value of a is greater than 195");
			if (a == 250)
				System.out.println("The value of a equal to 250");
			if (a >= 150)
				System.out.println("The value of a is less than equal to 150");
			if (!(a == 400))
				System.out.println("the value of a is not equals to 400");
		} else {
			System.out.println("Run the program");
		}
		System.out.println("--------------------------");

		if (a > 500) {
			System.out.println("the value of a is less than 500");
			if (a < 195)
				System.out.println("the value of a is greater than 195");
			if (a == 250)
				System.out.println("The value of a equal to 250");
			if (a >= 150)
				System.out.println("The value of a is less than equal to 150");
			if (!(a == 400))
				System.out.println("the value of a is not equals to 400");
		} else {
			System.out.println("Run the program");
		}
	}
}
