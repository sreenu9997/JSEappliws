package come.sreenu.functions;

public class AddingNumbers {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		int c = 0;
		
		/*
		c = a+b;
		c = 2*c+b;
		c = c+a;
		c = 4c;
		c= c + b;
		*/
		
		
		c = add(a,b);
		System.out.println("Ist one : "+c);
		c = add(2*c, b);
		System.out.println("second one: "+c);
		c = add(c, a);
		System.out.println("Third one: "+c);
		c = 4 *c;
		System.out.println("4th one: "+c);
		c = add(c, b);
		System.out.println("5th one: "+c);
		
	}
		public static int add(int s1, int s2) {
			int s3 = s1+s2;
			
			return s3;
		}
	

}