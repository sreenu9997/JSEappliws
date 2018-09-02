package come.sreeenu.whileloop;

public class NumberIncrementdown {

	/*
	1234
	567
	89
	10
	
	*/

	public static void main(String[] args) {
		
		int m=1;
		for(int i = 1; i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(m);
				m++;
			}
			System.out.println();
		}
	}
}
