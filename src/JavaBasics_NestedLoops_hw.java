
public class JavaBasics_NestedLoops_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 0; i<=9; i++) {
			for (int j=0; j<=9-i; j++) {
				System.out.print(" ");
			}
		for (int k = 0; k<=i; k++) {
			System.out.print(i + " ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for (int l =0; l<=8; l++) {
			for (int m=0; m<=l; m++) {
				System.out.print(m + " ");
			}
			System.out.println();
			
		}




		for (int s = 8; s>=1; s--) {
			for (int o = 1+s; o <=8; o++) {
				System.out.print(" ");
			}
				for (int k = 8; k<=8; k++) {
					System.out.print(s + " ");
				}
					System.out.println();
				
				
		}
		
	for (int a = 1; a<=8; a++) {
		for (int b = 1; b<=8-1; b ++) {
			System.out.print(" ");
		}
		for (int c = 1; c<=a; c++) {
			System.out.print("k");
		}
		System.out.println();
	}

	for (int d=1; d<=6; d++) {
		for (int e = 1; e<=d; e++) {
			if ((d+e)%2==1) {
				System.out.print(0 + " ");
			}else {
				System.out.print(1+ " ");
			}
		}
		System.out.println();
	}
	
	for (int f = 0; f<10; f++) {
		for (int g = 9; g>f; g--) {
			System.out.print(g + " ");
		}
		System.out.println();
	}
	for (int h =9; h>1; h--) {
		for (int p = 1; p<h; p ++) {
			System.out.print(p + " ");
		}
		System.out.println();
	}
	
	System.out.println("enter rows");
	
	for (int w =1; w<=5; w++ ) {
		for (int y=1; y<=w; y++) {
			System.out.print(w);
		}
		System.out.println();
	}
	

}
	
}