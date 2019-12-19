
public class Java_Basics_String_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String in literal terms is a series of characters.
		// why use String: important to meaning and making decision; main tools
		// for storing and processing language is going to be the String class

		// String as an array characters

		char[] charSample = { 'R', 'O', 'S', 'E' };
		String StrSample = new String(charSample);
		System.out.println(charSample);

		String StSample = "Rose";
		System.out.println(StSample);

		// String concatination
		String str1 = "Rock";
		String str2 = "Star";
		// Method 1 using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);
		// Method 2 using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4);

		// Method "length" of the String

		String str_Sample = "RockStar";
		System.out.println("Length of String " + str_Sample.length());

		// provide the index whose character you need to find
		// Character at position
		System.out.println("Character at position 5 " + str_Sample.charAt(5));

		// Method "indexOf" - help us determine the location of a specific
		// character that you specify
		// index of a given character
		System.out.println("Index of character " + str_Sample.indexOf('S'));

		// compareTo a String
		// based on Unicode value of each character of String
		// negative integer - negativ result
		// positiv integer - positiv result
		// "0" sign = equal on object
		System.out.println("Compare to ROCKSTAR " + str_Sample.compareTo("rockstar"));

		// compareTo IgnoreCase

		System.out.println("Compare to ROCKSTAR - IGNORE CASE " + str_Sample.compareToIgnoreCase("ROCKSTAr"));

		// "contain" Method

		System.out.println("Contain sequence of -tar " + str_Sample.contains("tsr"));

		System.out.println("***************************************");

		String text = "The rains have started here";
		String text1 = "The rains Have started here   ";

		System.out.println(text.length());

		System.out.println(text.charAt(5));
		System.out.println(text.indexOf("r")); // 1st occurence "r"
		System.out.println(text.indexOf("r", text.indexOf("r") + 1)); // 2nd occurence "r"
		System.out.println(text.indexOf("have"));
		System.out.println(text.indexOf("Hello")); // -1 we haven't this value

		System.out.println(text.equals(text1));
		System.out.println(text.equalsIgnoreCase(text1));
		System.out.println(text.equalsIgnoreCase(text1.trim()));

		System.out.println(text.substring(8, 18));

		String s = "   Hello World   ";

		System.out.println(s.trim());// remove the space before and after
		System.out.println(s.replace(" ", "")); // remove the space between words

		String date = "01-01-2017"; // 01/01/2017
		System.out.println(date.replace("-", "/"));

		// split
		String test = "Hello_World_Test_Sellenium";
		test.split("_");// remove the multiple value using array and loop
		String testval[] = test.split("_");
		for (int i = 0; i < testval.length; i++) {
			System.out.print(testval[i] + " ");
		}
		System.out.println();

		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;

		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
		System.out.println(x + y + (a + b));

	}

}
