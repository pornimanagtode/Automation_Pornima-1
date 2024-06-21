package practise;

public class Switch {

	public static void main(String[] args) {
		int day_no = 5;
		String days = null;
		switch (day_no) {
		case 1:
			days = "MOnday";
			break;
		case 2:
			days = "Tuesday";
		    break;
		case 3:
		     days = "Wednesday";
		  break;
		case 4:
		     days = "Thursday";
		  break;
		case 5:
		     days = "Friday";
		  break;
		case 6:
			days = "Saterday";
			break;
		case 7:
			days ="Sunday";
			
		
		default:
			System.out.println("none of the days are present");
			break;
		}System.out.println("5th day is : "+days);

			
		}
	
	
	

	}


