package come.sreeenu.whileloop;

public class NumbersPrintingincrement {
	/*
	1
	23
	456
	78910
	
	*/

	public static void main(String[] args) {
		
	int m=1;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			 System.out.print(m);
			 m++;
		}
		System.out.println("");
		
	}
}
}
