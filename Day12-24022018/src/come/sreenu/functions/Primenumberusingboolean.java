package come.sreenu.functions;

public class Primenumberusingboolean {

	
	static int count = 0;
	public static void main(String[] args) {
		
		int prime = 45;
		
		boolean result = isPrime(prime);
		System.out.println("number is : "+prime+ " and "+result);
	}
	
	public static boolean isPrime(int number) {
		
		for(int i=1; i<=number;i++) {
			if(number%i == 0) {
			count = count+1;	
			}
		}
		if(count == 2) {
			return true;
		}
		
	
		return false;
		
}
}
