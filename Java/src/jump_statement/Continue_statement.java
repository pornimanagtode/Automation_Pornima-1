package jump_statement;

public class Continue_statement {

	public static void main(String[] args) {
		for(int p = 30;p>=1;p--) {
			if(p == 25) {
				continue;
			}
			System.out.print(p+" ");
		} 
		System.out.println();
		System.out.println("----------------------------");
		
		int q = 25 ;
		while(q>=1) {
			q--;
			if( q==20) {
				continue;
			}
			System.out.print(q+" ");
				
		}
		
		
		System.out.println();
		System.out.println("----------------------------------");

		int r = 45;
		do {
			r--;
			if(r==35) {
				continue;
			}
			System.out.print(r+" ");
		}while(r>=20);
	}

}
