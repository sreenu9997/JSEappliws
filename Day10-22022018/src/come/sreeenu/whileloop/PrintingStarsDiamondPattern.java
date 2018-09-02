package come.sreeenu.whileloop;

public class PrintingStarsDiamondPattern {

	public static void main(String[] args) {
		
		
		/*
	
		
		*
       * *
	  * * *
	 * * * *
	* * * * *
	 * * * *
	  * * *
	   * *
		*
	
	*/
		
		int height = 5;
		for( int i = 1; i<=height; i++) {
			for(int j = height-1; j>=i;j--) {
				System.out.print(" ");
				}
			for(int k =1; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i =height-1;i>=1;i--) {
			for(int j=height-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
