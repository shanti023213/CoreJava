package DataTypes;

public class IntegerTest {

	public static void main(String[] args) {
		double a = 2.0/0.0;
		System.out.println(a);
		
		String s = "";
		for (int n = 10; n > 0; n /= 2)
		 s = (n % 2) + s;
		
		System.out.print(s);

	}

}
