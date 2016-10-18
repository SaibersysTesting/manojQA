package javaoops;  //  Run time Polymorphism usimg upcasting



	class Bike{  
		  void run(){System.out.println("running");}  
		}  
		class  Polymorphism extends Bike{  
		  void run(){System.out.println("running safely with 60km");}  
		  
		  public static void main(String args[]){  
		    Bike b = new Polymorphism();//upcasting  
		    b.run();  
		  }  
}
