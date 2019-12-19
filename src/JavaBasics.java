
public class JavaBasics {

	public static void main(String[] args) {
		//Exercise 1
//      Create an int with identifier “sales” assign the value 200
//      Create an int with identifier “cost” assign the value 85
//      Create an int with identifier “profit” calculate the profit based on sales and cost
//      Create String with identifier “The profit of the sales we had this far is <profit>
//      Run the code and make sure it works	

	int sales = 200;
	int cost = 85;
	int profit = sales - cost;
	String result = ("The profit of the sales we had this far is" + profit + " ");
	System.out.println(result);
	
	boolean myFirstBoolean = true; 
	boolean mySecondBoolean = false; 
	
	double myFirstDouble = 12.12;
	float myFirstFloat = 1.1f;
	
	char myFirstChar = 'A'; 
	
	int x  = 20;
	int y = 10; 
	System.out.println(x + " + " + y + " = " + (x + y));
	}
	
}
