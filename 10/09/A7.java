package javaoops;    // Multiple Inheritance using interface

 
	 interface Printable{  
		 void print();  
		 }  
		   
		 interface Showable{  
		 void show();  
		 }  
		   
		 class A7 implements Printable,Showable{  
		   
		 public void print(){System.out.println("Hi, This is Sai manoj");}  
		 public void show(){System.out.println("I am from SAIBERSYS");}  
		   
		 public static void main(String args[]){  
		 A7 obj = new A7();  
		 obj.print();  
		 obj.show();  
		  }  
}
