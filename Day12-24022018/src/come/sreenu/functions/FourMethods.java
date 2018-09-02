package come.sreenu.functions;

public class FourMethods {

	public static void main(String[] args) {
		int a =20; int b =5;
		int c = 0;
		
		c= addMethod(a, b);
		c=substractionMethod(a, b);
		c= multiplicationMethod(a, b);
		c= divisionMethod(a, b);
		System.out.println(c);
	}
	
	
	public static int addMethod(int a1, int a2) {
		
		int a3 = a1 +a2;
		return a3;
	}
	public static int substractionMethod(int s1, int s2) {
		int s3 = s1- s2;
		return s3;
	}
	public static int multiplicationMethod(int m1, int m2) {
		int m3 = m1*m2;
		return m3;
	}
	public static int divisionMethod(int d1, int d2) {
		int d3 = d1/d2;
		return d3;
	}
}
