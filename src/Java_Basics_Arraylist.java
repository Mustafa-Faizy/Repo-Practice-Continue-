import java.util.ArrayList;
public class Java_Basics_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList <String> firstNames = new ArrayList <String> ();
		
		firstNames.add("John");
		firstNames.add("Mike");
		firstNames.add("Bob");
		firstNames.add("Luis");
		firstNames.add("Luke");
		
		System.out.println("*****for each Loop*****");
		for (String name : firstNames) {
			System.out.println(name);
		}
		System.out.println("***for loop***");
		
		for (int i =0; i<5; i++) {
			System.out.println(i);
		}
	
		firstNames.remove(0);
		firstNames.remove(0);
		System.out.println("****after romeving***");
		
		for (String name : firstNames) {
		System.out.println(name + " ");}
		
		
	}

}
