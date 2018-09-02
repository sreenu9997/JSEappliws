package come.sreenu.functions;

public class PrintingEvenNumbers {

	public static void main(String[] args) {
		
		int maximum = 10;
		
		boolean result = checkEven(maximum);
		System.out.println(result);
	}
	public static boolean checkEven(int maximum) {
		
		
			if(maximum%2 == 0) {
				return true;
			}
			else {
				return false;
			}
		
		
	}
}
