package javaoops;   // program on static method

public class student9 {  
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	     static void change(){  
	     college = "KLU";  
	     }  
	  
	     student9(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	    public static void main(String args[]){  
	    student9.change();  
	  
	    student9 s1 = new student9 (111,"Karan");  
	    student9 s2 = new student9 (222,"Aryan");  
	    student9 s3 = new student9 (333,"Sonoo");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  
