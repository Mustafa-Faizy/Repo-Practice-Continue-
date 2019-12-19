
public class JavaBasic_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int age [] =  new int [10];
		
		//int age [] = {10,1,12,13,14,15,16,17,18,19};
		
		//int i = 9;
		/*for (int i = 0; i < 10; i++) { 
			System.out.println("outer loop star");
			for (int j = 0; j < 5; j++) {
	//	System.out.println(i+ "/" +j);		
			}
		//System.out.println("outer loop end \n");
	}*/
		int size = 5;
		
		
	 for (int i = 1; i <= size; i++) {
		
		
		 for ( int j = 1; j <= size; j++) {
			if (j<i )
				
		 System.out.print(" ");
			else 
				System.out.print(j );
			System.out.print(" ");
	
		 }
		System.out.println();
		

	 
		for (int x = 1; x <= 5; x ++) {
			for (int k = 1; k<=x; k++) {
				System.out.print(k + " ");
			}
		}	System.out.println();
	
		}
	
	}

}
