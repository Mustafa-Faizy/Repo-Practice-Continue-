
public class JavaBasic_Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 // create all the variables
		double amount = 25 ;
		double taxRate = 0.07;
		double discountRate = 0.3;
		
		// calculate the total, tax amount, discount amount
		// to calculate the discount amoun, i have to get the percentage subtracted the amount
		/*double discountAmount = amount * discountRate / 100; //2
		double taxAmount = amount * taxRate / 100; //0.2*/
		 //10-2-0.2=7.8
		
		
		double discountAmount = amount * discountRate; //10*0.2=2.0
		double taxAmount = amount * taxRate; //10*0.02=0.2
		double total = amount - discountAmount + taxAmount;
		System.out.println(discountAmount);
		System.out.println(taxAmount);
		
		
	String result = 
			"                   Tek School            \n "
			+ "                   Receipt              \n"
			+ " \nAmount................................." + amount
			+ " \nDiscount Rate.........................." + (discountRate*100) + "%"
			+ " \nDiscount Amount.....................(-)" + discountAmount + "$"
			+ " \ntax...................................." + (taxRate*100) + "%"
			+ "\ntax Amount .........................(+)" + taxAmount + "$"
			+"\n____________________________________________"
			
			+ " \ntotal.................................." + total + "$"
			+ "\n\n\tvisit our website"
			+ "\n\tTekSchoolofAmerica@gmail.com";
        
        System.out.println(result);
	
	
	
	
	
	
	}

}
