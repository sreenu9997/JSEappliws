package come.sreeenu.whileloop;

public class PrintingStarsDifferentshape2Logic {
public static void main(String[] args) {

//	
//               *
//             * *
//           * * *
//         * * * *
//       * * * * *

	/*	
			z= 4 i =1 						+ + + + *
			=============
			z= 3 i = 2                      + + + * *
			==========
			z = 2 i = 3 		      		+ + * * *
			===========
			z= 1  i = 4 		       		+ * * * *
			===========
			z= 0 i = 5 		       			* * * * *

			z= -1 i = 6 not satified condition came out from the main.
*/
      
       
	int z = 4;
	for(int i=1; i<=5; i++) {
		for(int j =1; j<=z; j++) {
			System.out.print("  ");
		}
		for (int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
		z = z-1;
	}
}
}