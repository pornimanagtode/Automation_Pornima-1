package practise;

public class Static_Variable {
	int k =56;
		 
		 //Instance Method
		 public void FNP() {
			 float FNP = 23.67f;
				System.out.println(FNP);
		}
		
		
		//static Method
	public static void ABC() {
		
		char y = 'T';
		System.out.println(y);
		}
		
			 	 
		
		 public static void main(String[] args) {
		Static_Variable p = new Static_Variable();
		System.out.println(p.k);
		 p.FNP();
		 ABC();
		 
		
		

	}

}
