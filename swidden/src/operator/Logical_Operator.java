package operator;

public class Logical_Operator {

	public static void main(String[] args) {
		// A)logical and ---&&
		int p = 100;
		int q = 500;
		//true, false = false
		boolean r = p<q && p>q;
		System.out.println(r);
	
	
		int m = 100;
		int n = 500;
		int o = 500;
		//false, false = false
		boolean u = m>n && n<m;
		System.out.println(u);
		
		byte a = 50;
		byte b = 60;
		byte c = 70;
		// true, true = true
		boolean x = a<b && c>b;
		System.out.println(x);
		  
		// B) LOgical or -----||
		//in logical|| operator any of the condition is true then output will be true 
		//otherwise it gives output as false.
		int j = 100;
		int k = 500;
		int l = 500;
		//false, true = true
		boolean z = j>k || k==l;
		System.out.println(z);
	
		
		 //C) logical not---!
		//it gives reverse output.
		 long f = 798;
	     long i = 776;
	     long v = 564;
	     System.out.println(!(f>i));
		
		

		}
	


		

	

}
