package nested_package;

public class InvertedHalf_pyramid {

	public static void main(String[] args) {
		//Inverted Half pyramid
		//rows 6 and columns 6
		for( int a= 6; a>=1; a--) {
			for( int b= 1; b<=a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------");  
		
		for( int c= 6; c>=1; c--) {
			for( int d= 1; d<=c; d++) {
				System.out.print (d+" ");
			}
			System.out.println();
	}

	} 
	}
