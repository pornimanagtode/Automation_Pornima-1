package practise;

public class Instance_method {
int a= 19;
short b= 34;
long f=45;
// instance method
public void login() {
	
	int q=65;
	System.out.println(q);
	float w=34;
	System.out.println(w);
	short m=56;
	System.out.println(m);
	
}
public static void main(String[] args) {
	Instance_method y= new Instance_method();
	System.out.println(y.a);
	System.out.println(y.b);
	System.out.println(y.f);
	y.login();
	
	
			

}
}
