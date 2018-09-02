package come.sreeenu.whileloop;

public class NumberDecrement {

	public static void main(String[] args) {
		int i, j;
		int k = 0;
		int n= 4;
		for(i =1; i<=n;i++) {
			k +=i;
			for(j=k;j>k-i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
