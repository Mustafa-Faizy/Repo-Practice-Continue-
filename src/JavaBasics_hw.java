
public class JavaBasics_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String identifier = "literal value";
 
 String title = "Catch-22";
 String author = "Joseph Heller";
 String sentence = author + "wrote" + title;
 
 int  a =10;
 int b = 5;
  String result = a + "+" + b + "=" + a + b;
  String other = a + "+" + b + "=" + (a + b);
  
  System.out.println(sentence + "\n" + result+ "\n" + other);	
	
	
	int x = 20;
	int y = 10; 
	int z = x + y;
	System.out.println(x + " + " + y + " = " + (x+y ));
	
	
	String sumString = "5" + "5";
	System.out.println("String sum: " + sumString);
	
	int sumInt = 5 + 5;
	System.out.println("Int sum:" + sumInt);
	
	
	int x = 13;
	int y = 5; 
	
	System.out.println(x%y);
	
	double d1 = 5;
	double d2 = 3;
	System.out.println(d1/d2);
	System.out.println(d1%d2);
	int i1 = 5;
	int i2 = 3;
	System.out.println(i1/i2);
	
	System.out.println(i1%i2);
	
	double x = 6.7; 
	int y = 3;
	 double sum = x+y;
	 double mult = x*y;
	 double div = x/y;
	 
	 System.out.println(div-mult+sum);
	 
	 double implicit = 6.7/3;
	 int number1 = 'd'/16;
	 double noCast = 10/3;
	 
	//System.out.println(noCast);*/
	// I am going to give you number of apples everyday to divide to a number of people
	// I want to know if we can fully divide the apples
	int numberOfApples = 145;
	int numberOfPeople = 55;
	
	 if (numberOfApples % numberOfPeople == 0) {
		 System.out.println(numberOfApples % numberOfPeople);
		 System.out.println("you number is divisable 3");
		 
	 } else {
		 System.out.println(numberOfApples % numberOfPeople);
			 System.out.println("you number can not divide to 3 people fully");
		 }
	 
	int x = 10;
	++x;
	
	--x;
	 System.out.println(x -2);
	 System.out.println(x);
	x--;
	System.out.println(x);
	x++;
	System.out.println(x+3);
	System.out.println(x);
	
	int a = 5;
	int b= 6;
	int c= ++a - b++ + a++;
	System.out.println(c);
	System.out.println(c);
	
	
	String sentence = "\tI shouted, \"Go away!\" as I "
			+ "ran towards the wolf.\n\tIt "
			+ "bared its teeth to me in reply.";
	
	String escape = "this is the \"word\" I like to print";
			
	int age = 9;
	double height = 4.3;
	
	String output = "Billy is " + age+ " years old, and " + height+ " feet tall.";
	System.out.println(sentence + "\n\n\n" + escape + "\n\n\n" + output);
	
	System.out.println(escape);
	}
}
