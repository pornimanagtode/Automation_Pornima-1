package return_statement;



public class Return_Method {
	//1.Without return type and no parameters.
			public void function(){
				System.out.println("API testing");
				}
			
			//2.Without return type and with parameter.
			public static void come(int i,int j){
				System.out.println("the value of i is: "+i);
				System.out.println("the value of j is: "+j);
				
			}
			//3.With return type and with Parameters
			public void get (long k,long l){
				System.out.println("The value of k is: "+k);
				System.out.println("The value of l is: "+l);
				return;
			}
			//4.With return type and having Parameter
			public float  book (float g, float h) {
				return g*h;
			}
		
			
			public static void main(String[] args) {
				Return_Method p = new Return_Method();
				p.function();
				come(200,400);
				p.get(250,300);
			    System.out.println(p.book(45,50));
			
						
				} 

	

	}



