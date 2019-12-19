
public class JavaBasics_exc_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Write a loop to calculate the tax amount based on the Tax Rate 
 for each record and store it to the Tax Amount column.
 Write a loop to calculate the total after the tax is applied to the 
 price and store it to the Total column 
 Write a condition if total is more than $1000 give 5% discount to the item */
		
		
		//creating array to a start data
		double [][] data = new double [5][5]; 
		
		data [0][0] = 10.0;
		data [1][0] = 12.0;
		data [2][0] = 6.0;
		data [3][0] = 7.0;
		data [4][0] = 11.0;
		
		data [0][1] = 10.99;
		data [1][1] = 13.99;
		data [2][1] = 15.99;
		data [3][1] = 12.99;
	    data [4][1] = 7.99;
	
	    data [0][2] = 0.05;
	    data [1][2] = 0.04;
	    data [2][2] = 0.07;
	    data [3][2] = 0.08;
	    data [4][2] = 0.06;
	
	
	for (int i = 0; i<data.length; i++) {
		data [i][3] = data [i][0] * data [i][1] * data [i][2] ;
	}
	for (int i = 0; i<data.length; i++) {
		data [i][4] = (data [i][0] * data [i][1]) + data [i][3] ;
			
		} 
	for (int i = 0; i<data.length; i ++) {
	if (data [i][4] >1000 ) {
		data [i][4] = data [i][4] - (data [i][4] * 0.05);}
	}
	
	for (int i = 0; i<data.length; i++) {
		System.out.println("\n\n" + "Quantity" + "\t"+ data [i][0] + "\n"+ 
				           "Price" + "\t\t" + data [i][1] + "\n"+
				           "Tax Rate" + "\t" + data [i][2]+ "\n"+
				           "Tax Amount" + "\t" + data [i][3] + "\n" +
				           "Total" + "\t\t" + data [i][4] );
	}
		
	}
	
	}



