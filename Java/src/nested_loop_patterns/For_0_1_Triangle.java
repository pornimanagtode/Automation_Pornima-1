package nested_loop_patterns;

public class For_0_1_Triangle {

	public static void main(String[] args) {
		//rows 8 and column 8
		
		for(int a = 1; a<=8;a++) {
			for(int b= 1;b<=a; b++) {
				int c= a+b;
				if( c%2==0){
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
			
		}

	}

}
