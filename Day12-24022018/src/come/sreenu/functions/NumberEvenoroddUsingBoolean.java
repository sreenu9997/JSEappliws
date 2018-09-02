package come.sreenu.functions;

public class NumberEvenoroddUsingBoolean {

	public static void main(String[] args) {
		
		int numbers = 23451;
		boolean result = isEven(numbers);
		System.out.println(result);
	}
	public static boolean isEven(int n) {
		if(n%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
