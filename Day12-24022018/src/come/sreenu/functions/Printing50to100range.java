package come.sreenu.functions;

public class Printing50to100range {
	
	
	public static void main(String[] args) {
		
		int number = 95;
		
		boolean result = isCheck(number);
		System.out.println(result);
		
	}
		
		public static boolean isCheck(int num) {
			if(num >=50 | num>=100) {
				return true;
			}else {
				return false;
			}
		}
	}

