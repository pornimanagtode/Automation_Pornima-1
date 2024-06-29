package practise;

public class Local_Variable {
float gp = 67.98f;
	//Instance Method
    public void wrt() {
    	short F = 45;
    	System.out.println(F);
	}


	public static void main(String[] args) {
		int w = 43;
		System.out.println(w);
		Local_Variable G = new Local_Variable ();
		System.out.println(G.gp);
		G.wrt();
		

	}

}
