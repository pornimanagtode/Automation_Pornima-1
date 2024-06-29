package variable;

public class Static_variable {

	static float j = 34.45f;
	static double k = 32;
	static byte a = 54;
	static short d = 250;
	
	public void addition() {
		int p = 9067;
		System.out.println(p);
	}

	public static void city() {
		System.out.println(j);
		System.out.println(k);
		System.out.println(a);
		System.out.println(d);

	}

	public static void main(String[] args) {
		Static_variable vr = new Static_variable();
		vr.addition();
		city();
	}

}
