
public class JavaBasic_loop_nested_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int j=0; j<10; j++) {
			for(int i=0; i<=j; i++) {
				System.out.print(i+1+" ");
				}
			System.out.print("   ");
			
			for(int b=10; j<b; b--) {				
				System.out.print(b+" ");
				}
			
			System.out.println();	
		}
	}

}
