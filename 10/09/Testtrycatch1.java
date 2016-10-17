package javaoops;  //testing trycatch exception

public class Testtrycatch1 {
	static int data;
	public static void main(String args[]){  
		   try{  
		      data =20/0;   
		   }catch(ArithmeticException e){System.out.println(e);}  
		   System.out.println("rest of the code...");  
		}  

}
