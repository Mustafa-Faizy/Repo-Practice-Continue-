import java.util.ArrayList;

public class Java_Basics_StringMethods_practiceInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> names = new ArrayList <String> ();
		
		names.add("mack");
		names.add("david");
		names.add("john");
		names.add("mike");
		names.add("anzargul");
		
		for (String name : names) {
			System.out.println(name.toUpperCase().charAt(0)+ name.substring(1, name.length()));
		}
		
		System.out.println("*********String Methods******");
		String testData = "  This is the string that I'm going to test on " ;
		String testData2 = "This is the string that I'm going to test on ";
		
		//int l = testData.length(); it will return
		
		//length
		testData.length();
		int l = testData.length();
		System.out.println(l);//it will return
		
		//charAt
		
		System.out.println(testData.charAt(5));
		
		//substring
		
		System.out.println(testData.substring(8));
		System.out.println(testData.substring(10, 15));
		
		//indexOf (index number that the first time mentioned that the value)
		
		System.out.println(testData.indexOf(" is"));
		//Equals
		System.out.println(testData.equals(testData2));
		System.out.println();
		String x = "this";
		String y = "THis";
		//EqualsIgnoreCase (doesn't matter it will be lower or uppercase)
		System.out.println(x.equalsIgnoreCase(y));
		
		//Trim
		System.out.println("This is trim  " + testData.trim());
		System.out.println();
		
		//compareTo if it's = 0 then it's equal, if it's no 0 it's no equal
		System.out.println("This is compareTo " + x.compareTo(y));
		
		//compareToIgnoreCase (ignore lower or uppercase)
		System.out.println("This is compare to ignore case " + x.compareToIgnoreCase(y));
		
		//contains check do you have some value (like "is") in testdata
		
		System.out.println("This is contains "+ testData.contains("on"));
		
	
		//endsWith/check this String ending with "n" or any value
		System.out.println(testData.trim().endsWith("n"));
		
		//startsWith
		System.out.println(testData.startsWith("x"));
		
		String test = "This is i i i i 923!!!&%";
		//replaceAll
		System.out.println(test.replaceAll("i", "a") + test.replaceAll("9", "0"));
		
		//replaceFirst
		System.out.println(test.replaceFirst("s", "b"));
		
		//I want to change first lower case to uppercase
		//we need use charAt because we don't know in which letter starts our String
		//we need use convert String.valueOf(charAt) because replaceFirst has String class, and
		//charAt has char datatype;
		
		System.out.println("This is replacefirst with uppercase "+x.replaceFirst("[a-zA-Z]", String.valueOf(x.charAt(0)).toUpperCase()));
		
		//tocharArray
		
		char name [] = x.toCharArray();
		
		for (char c : name) {
			System.out.println(c);
		}
		System.out.println("*****************");
		String str = "Those";
		
		char ch [] = str.toCharArray();
		
		for (int i=ch.length; i>0; i-- ) {
			System.out.print(ch [i-1]);
		}
		System.out.println();
		System.out.println("****************");
		String regularExpressions = "This is a test 09685 &*^%";
		//give me all symbols which use in the String
		System.out.println(regularExpressions.replaceAll("[a-zA-Z0-9]", ""));
		System.out.println(regularExpressions.replaceAll("[a-zA-Z]", ""));
		
		
		
	}

}
