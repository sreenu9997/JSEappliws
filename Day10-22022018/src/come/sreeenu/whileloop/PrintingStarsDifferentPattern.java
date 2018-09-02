package come.sreeenu.whileloop;

public class PrintingStarsDifferentPattern {

	public static void main(String[] args) {
		 
	/*      *
		   * *
		  * * *
		 * * * *
		* * * * *
		
		
		m =5 i = 1    + + + + *
		==========
		m =4 i = 2     + + + *  *  
		==========
		m =3 i = 3     + + *  *  *
		==========
		m =2 i = 4     + *  *  *  *
		==========
		m =1 i = 5     *  *  *  *  *
	*
	*
	*/
		int m = 4;
		for (int i=1;i<=5; i++) {
			for(int j= 1; j<=m;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			m=m-1;
		}
	}
}
