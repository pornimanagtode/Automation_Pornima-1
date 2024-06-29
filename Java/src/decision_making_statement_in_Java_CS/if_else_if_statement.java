package decision_making_statement_in_Java_CS;

public class if_else_if_statement {

	public static void main(String[] args) {
		String name = "sam";
		String colour = "pink";
		String City = "Katmandu";

		if (name == "sam") {
			System.out.println("The name is sam");
		} else if (name == "Rono") {
			System.out.println("the name boy is Rono");
		} else if (name == "Robert") {
			System.out.println("Robert is the name of boy");
		} else {
			System.out.println("execute the code");
			
			}System.out.println("----------------------------");
		

		if (colour == "yellow") {
			System.out.println("the name of colour is Yellow");
		} else if (colour == "pink") {
			System.out.println("The colour name is pink");
		} else {
			System.out.println("write the correct script");
		}
		System.out.println("----------------------------------");
		if (City == "Nagpur") {
			System.out.println("The name of city is Nagpur");
		} else if (City == "pune") {
			System.out.println("choose name of city as a pune");
		} else {
			System.out.println("The name of city is Katmandu ");
		}
	}
}
