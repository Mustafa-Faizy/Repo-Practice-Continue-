
public class JavaBasics_Ecs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//create array list for items;
		String items[] = new String [10];
		
		items[0] = "Iphone 11";
		items[1] = "Iphone 6";
		items[2] = "Iphone 11 Pro";
		items[3] = "Iphone X";
		items[4] = "Iphone 11 Pro";
		items[5] = "Iphone 11 Pro Max";
		//declare and initialize other variables, boolean;
		boolean paymentStatus = false;
		double balance = 5561.25;
		double amountPaid = 5561.25;
		//create if statement;
		if (amountPaid >= balance) {
			paymentStatus = true;
		}
		
		if (paymentStatus == true) {
			System.out.println("Ship these items: ");

			//we need to create for loop, because we have multiple values
			for (int i = 0; i < items.length; i++) {
				System.out.println((i+1) + ". " + items[i]);
			}
		} else {
			System.out.println("DO NOT ship these items: ");
			for (int i = 0; i < items.length; i++) {
				System.out.println((i+1) + ". " + items[i]);
			}
			//printed it
			System.out.println("\n*Unpaid balance!");
		}
		
		//create an Array that the stores and price of the shopping cart
		//add some items to the array
		//
		//create 
		
		/*String Stores = new String [5];
		stores [0] = "ALD";
		stores [1] = "Mar";
		stores [2] = "Ipe X";
		stores [3] = "Ip Pro";
		stores [4] = "Ipax";
		*/
		
		
		
	}

	}

