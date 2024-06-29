package switch_statement;

public class Switch_Combination {

	public static void main(String[] args) {
    int day_no = 4;
    String day = null;
    
    switch (day_no) {
    case 1:
    	day = "Monday";
    	break;
    case 2 :
    	day = "Tuesday";
    	break;
    case 3:
    	day = "Wednesday";
    	break;
    case 4 :
    	day = "Thursday";
    	break;
    case 5:
    	day = "friday";
    	break;
    case 6:
    	day = "saturday";
    	break;
    	
    	default:
    		 System.out.println(" none of the day");
    		break;   
          
    }System.out.println("the name of the day is: "+ day);
   
   
    
		
		

}
}
