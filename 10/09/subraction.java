package javaoops;  // creating method with return data type

public class subraction {

	int sub() {
		int a = 55;
		int b = 44;
		int c = a-b ;
		return c;
		
	} 
	public static void main ( String [] args ){
		subraction abc = new subraction ();
		int res = abc.sub();
		
		System.out.println("sub"+ res);
		
	}
	
}

