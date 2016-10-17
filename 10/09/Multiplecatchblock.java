package javaoops;  // testing syntax on try multiple catch exception

public class Multiplecatchblock {
 
	 public static void main(String args[]){  
		   try{  
		    int a[]=new int[7];  
		    a[8]=10/0;  
		   }  
		   catch(ArithmeticException e){System.out.println(" arthematictask is completed");}  
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("arrayboundtask  completed");}  
		   catch(Exception e){System.out.println("common task completed");}  
		  
		   System.out.println("rest of the code...");  
		 }  
}
