package javaoops; // declaring final variable

public class Bike1 {
	
	final int speedlimit=90;//final variable  
	 void run(){  
	  speedlimit=100;  
	 }  
	 public static void main(String args[]){  
	 Bike1 obj=new  Bike1();  
	 obj.run();  
	 }  
}
