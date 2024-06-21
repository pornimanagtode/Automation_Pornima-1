package practise;

public class Instance_Variable {
	int p = 45;

	// Instance method
	public void Api() {
		float b = 67.89f;
		System.out.println(b);
	}

	// static method
	public static void additon() {
		short c = 87;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Instance_Variable f = new Instance_Variable();
		System.out.println(f.p);
		// Instance method
		f.Api();

		// static method
		additon();
	}

}
