package javaoops;  // creating method with return data type and parameter


public class addition {
 Double add (Double a,int b ){
 return(a+b);
 }
	public static void main (String[] args) {
		// TODO Auto-generated method stub
    addition abc = new addition ();
    Double a = Double.parseDouble("9.3");
    int b = Integer.parseInt("10");
    Double res = abc.add(a,b);
    System.out.println("sum: "+res);
	}

}
