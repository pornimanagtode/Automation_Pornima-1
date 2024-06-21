package methods;

public class Din {

	int k = 12;
	int a = 15;

	// instance method

	public void search() {
		int v = 45;
		System.out.println(v);
		double g = 67.6;
		System.out.println(g);
		float n = 899.3763f;
		System.out.println(n);

	}

	public static void main(String[] args) {
		Din h = new Din();
		System.out.println(h.a);
		System.out.println(h.k);
		h.search();

	}

}
