
public class Javabasic_Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String info [] [] = {
				{"Ahmad", "password123"}, 
				{"David", "pass123"}, 
				{"Joschua", "Coffee123897"} 
		};
		/*System.out.println(info[1][1]);
		System.out.println("User Name =>" + info [2][0] + " " + "Password"+ info [2][1]);
		
		*/
		
		
		for (int row = 0; row<3; row++) {
			//System.out.println(info [1][row]);
		System.out.println("User Name =>" + info [row][0] + " " + "Password"+ info [row][1]);	
			//for (int colNum = 0; colNum<2; colNum++) {
			
				//System.out.print(info [row][colNum] + " ");
			}
		System.out.println("");
		
		
		
		
		String infoAndPass [] [] = {
				{"Ahmad", "password123", "VA", "223521", "Finance"}, 
				{"David", "pass123", "VA", "223514", "Finance"}, 
				{"Joschua", "Coffee123897", "VA", "223545", "Finance"}
		};
		
		
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j < 5; j++) {
		System.out.print(infoAndPass[i][j] + " ");
			}
			System.out.println();
		}
	}
		
		
		
		
		
}

	


