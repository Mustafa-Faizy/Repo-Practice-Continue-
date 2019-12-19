
public class Java_Basics_Exercise_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a String "This is when i test these methods! lets go 123!!!"
		//print the string but convert everything to upper case
		//print a portion of the string index 10 to 15
		//print the index number of the first occurrence of "lets"
				
		//Challenge:
		//check to see if there is any special sigh/symbol used in the string
		//if so, then print this message "there are symbols in the text" if not
		//then print "no sign is used"
		//if you are up for it, print the signs if there are any signs in the text as well
		
		String Data = "This is when i test these methods! lets go 123!!!";
		System.out.println(Data.toUpperCase());
		
		System.out.println(Data.substring(10, 15));
		
		System.out.println(Data.indexOf("lets"));
		
		System.out.println("*******Challenge*******");
		
		System.out.println(Data.replaceAll("[a-zA-Z0-9 ]",""));
		
		if (Data.replaceAll("[a-zA-Z0-9 ]","").length()>=0){
			System.out.println("there are symbols in the text: " + Data.replaceAll("[a-zA-Z0-9 ]",""));
		}
		else {
			System.out.println("no sign is used");
		}
		
		//create a String "This is when i test these methods lets go "
		String Data1 = "This is when i test these methods lets go ";
		if (Data1.replaceAll("[a-zA-Z0-9 ]","").length()>0){
			System.out.println("there are symbols in the text: " + Data1.replaceAll("[a-zA-Z0-9 ]",""));
		}
		else {
			System.out.println("no sign is used");
		}
		
		String text = "This is te text 09683 !&*(^";
		System.out.println(text.replaceAll("[!&*]", ""));
		
		
		
	}

}
