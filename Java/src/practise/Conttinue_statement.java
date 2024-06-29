package practise;

public class Conttinue_statement {
	
	//for decrement
	public void test() {
		float j = 60f;
		while(j<=85) {
			j--;
			
			if (j==55) {
				continue;
			}
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("----------------------------");
	}
	
	
	//for increment
	public static void main(String[] args) {
		Conttinue_statement k = new Conttinue_statement();
		k.test();
		int p = 70;
		while(p<=100) {
			p++;
			
			if(p==96) {
			continue;	
			}
			System.out.print(p+" ");
		}
	}

}
