package javaoops;   // creating abstarct class with abstract method

 
	  abstract class Truck{  
		  abstract void run();  
		}  
	  
		class Leyland extends Truck{  
			
		void run(){System.out.println(" Truck is running safely..");}
		
		public static void main(String args[]){  
		 Leyland obj = new Leyland();  
		 obj.run();  
		}  
}
