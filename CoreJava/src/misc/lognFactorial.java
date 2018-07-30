package misc;

public class lognFactorial {
	
	 public static void main(String[] args)
	 {
		 System.out.println(func(10));
	 }
	public static double func(int n) {
		   if(n==1)
		     return 0;
		   return func(n-1) + Math.log(n);
		}

}
