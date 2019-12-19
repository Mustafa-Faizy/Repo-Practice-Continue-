
public class JavaBasics_IF_exc_about_stores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an Array that the stores and price of the shopping cart
				//add some items to the array
				//
				//create a double that stores the amount paid.
		//using a loop calculate the total amount for the shopping cart
		//if the amount paid is sufficient print the list of items and say that it ship items
		//if not, print unpaid balance of ##$;
		
				// create an array with the values
		
				String ShoppingCart [][] ={
				 {"ALD", "10.99"},
				 {"Mar" , "11.99"},
				 {"Ipe X", "12.99"},
				 {"Ip Pro", "15.99"},
				 {"Ipax", "16.99"}
				 };
	 
				//create double variables amount and total amount
			double amountPaid = 45.99;
			double balance = 0; 
			System.out.println("******************\n");
			// find the total amount
			
			for (int i = 0; i < ShoppingCart.length; i++) {
				System.out.println(ShoppingCart [i][1]);
				
			// add the prices
			System.out.println(balance = balance + Double.valueOf(ShoppingCart [i][1]));
			
			
			}
			if (amountPaid > balance) {
				System.out.println("Unpaid balance");
			}
			else {
				System.out.println("Ship the items on the list");}
			
				for (int i = 0; i < ShoppingCart.length; i++) {
					
					System.out.println(ShoppingCart [i][0] + "............" 
					+ ShoppingCart [i][1] + "$");
				}
				System.out.println("_____________________________");
				System.out.println("AmountPaid............" + amountPaid);
			System.out.println("Total balance..........." + balance);
			System.out.println("Difference..............." + ( amountPaid - balance) );


	}

}
