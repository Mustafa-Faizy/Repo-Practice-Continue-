import java.util.ArrayList;

public class Java_Basics_exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> FirstNames = new ArrayList <String> ();
		
		FirstNames.add("John");
		FirstNames.add("Mike");
		FirstNames.add("Bo");
		FirstNames.add("Safi");
		FirstNames.add("Tim");
		
		
		for (String word : FirstNames) {
			System.out.println(word + " ");
	}

		FirstNames.remove(0);
		FirstNames.remove(1);
		System.out.println("ArrayList after removing");
		
		for (String word : FirstNames) {
			System.out.println(word + " ");}
}
}
