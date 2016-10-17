package javaoops;

public class Nestedtry {
  static int b;
	 public static void main(String args[]){  
		  try{  
		    try{  
		     System.out.println("going to divide");  
		      b =39/0;  
		    }catch(ArithmeticException e){System.out.println(e);}  
		   
		    try{  
		    int a[]=new int[5];  
		    a[5]=4;  
		    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
		     
		    System.out.println("other statement");  
		  }catch(Exception e){System.out.println("handeled");}  
		  
		  System.out.println("rest of the code..");  
		 }  
}
