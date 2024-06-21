package method_string;

public class Various_Methods_of_String {

	public static void main(String[] args) {
	//1:length method
	String name = "Stp Infotech";
	System.out.println("output of length is: "+name.length());
	System.out.println("---------------------------");
	
	//2:replace Method ("old char","new Char"):
	String d = "Automation";
	System.out.println("output of replace method is: "+d.replace("ion", "e"));
	System.out.println("------------------------------");
	
	//3:index of Method ("Character"):
	String h = "Manual testing_123";
	System.out.println("output of Index Method is: "+h.indexOf("1"));
	System.out.println("--------------------------");
	
	//4:char at ( int index):
     String j= "API";
     System.out.println(j.charAt(2));
     System.out.println("-----------------");
     
     //5: substring(int begining index,int ending index):
     String k= "Quality";
     System.out.println(k.substring(4, 5));
     System.out.println("--------------------");
    
     //6: Concat(another string)Concat is used for joining purpose.
    System.out.println(k.concat("Analyst"));
    System.out.println(k+" " +"Analyst");
    //7: equals method
       String expected = "Automation Testing" ;
       String Actual = "automation testing";
       System.out.println(expected.equals(Actual));
       System.out.println("----------------");
       
       String Expected = "Pornima";
       String actual  = "Pornima";
       System.out.println(Expected.equals(actual));
       System.out.println("--------------------------");
       
       //8: equalsignore method
       String p = "Mobile testing";
       String Q ="mobile testing";
        System.out.println(p.equalsIgnoreCase(Q));
        System.out.println("---------------");
       
        //9:trim method
        String n = "   High School   ";
      System.out.println(n.trim());
      
      //10: Ends with method
      String b_5 ="Execution ends";
      System.out.println(b_5.endsWith("ends"));
       
      // 11: To uppercase Method ()
      String s = "documents";
     System.out.println(s.toUpperCase());
     
     //12: To Lowecase Method 
     String l = "Documents";
     System.out.println(l.toLowerCase());
     
      //13: is empty method 
      String docs = "cat";
      System.out.println(docs.isEmpty()); 
      
      //14: Contains method
     String o = "Software_testing";
     System.out.println(o.contains("testing"));
      
	
	
	
	
	
	
	}

}
