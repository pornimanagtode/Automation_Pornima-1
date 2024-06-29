package practise;

public class loop_Patterns_for_inverted_half_pyramid {

	public static void main(String[] args) {
		// 1)for inverted halfpyramid
		//row 5 and column 4               
		
         for(int a = 5; a>=1; a-- ) {
         for(int b = 1; b<=a; b++ ) {
        	 
        	 System.out.print("* ");
        	 }
        	System.out.println();
         }
         System.out.println("---------------------------------------");
         
      //inverted halfpyramid in number format   
       // 8 rows &8 columns
         
        for(int p =8; p>=1; p--) {
        	for(int q = 1; q<=p; q++) {
        		System.out.print(q+" ");
             }
        System.out.println();
        }
       
	}
}

	
