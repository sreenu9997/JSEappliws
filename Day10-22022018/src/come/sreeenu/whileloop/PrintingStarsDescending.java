package come.sreeenu.whileloop;

public class PrintingStarsDescending {

	public static void main(String[] args) {
		
	/*
		* * * * 
		 * * * 
		  * * 
		   *
	
	m = 0 n = 4 i = 1    *  *  *  *  *
	=================
	m = 1 n = 3 i = 2      *  *  *  *
	=================
	m = 2 n = 2 i = 3       *  *  * 
	=================
	m = 3 n = 1 i = 4        *  * 
	=================
	m = 4 n = 0 i = 5          *    
	=================
	m = 5 n = -1 i = 6 condition not satisfied
	
	*/	    
		int m= 0;
		int n = 4;
		for (int i=1; i<=5; i++) {
			
			for (int j=1;j<=m;j++) {
				System.out.print(" ");
			}m=m+1;
			for( int k=1;k<=n;k++) {
				System.out.print("* ");
			}
			System.out.println();
			n=n-1;
		}
	}
}
