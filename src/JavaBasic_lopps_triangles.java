
public class JavaBasic_lopps_triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		//for (int i =1; i<=5; i++ ) {
		//	for (int j = 1; j<=i; j++) {
		//		System.out.print(j + " ");
			}
			System.out.println();
		}*/
	
	
	String Star = "*";
	String Space = " ";

	
		
		for (int r = 10; r >0; r --) {
			for (int c = 10; c> r; c--) {
				System.out.print(Space);
			
		for (c = 10; c> r - 1; c-- ) {
			System.out.print(Star);
		}
		System.out.println();
		}
		}
	
	}

}
