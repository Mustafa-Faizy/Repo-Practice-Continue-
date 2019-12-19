
public class Homework_W1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		// Put your code here:*/

		int sizeOfComicBookCollection;
		String mostPopularMovieStar;
		double usDollarBritishPoundConversionRate;
		short shoppingDaysUntilHalloween ;
		long starsInTheMilkyWay;
		
		
		
		
		/**
		 * For this portion of the assignment you will be working with String
		 * concatenation.
	
		 * 
		 * 5) Declare a String variable with the identifier withSpace and assign it the
		 * value of concatenating sentence2 on to the end of sentence1, but make sure to
		 * also concatenate an string literal with a space in it between the sentence1
		 * and sentence2
		 */
		String Sentence1 = "Java is difficult programm";
		String Sentence2 = "But nothing is impossible!";
		int points = 5;
		String NoSpace = Sentence1 + Sentence2;
		String WithSpace = Sentence1 + " " + Sentence2;
		System.out.println(Sentence1);
		System.out.println(Sentence2);
		System.out.println(points);
		System.out.println(NoSpace);
		System.out.println(WithSpace);
		
		 /* 
		 * 
		 * 6) Declare a String variable with the identifier message1 and assign it the
		 * value as follows:
		 * 
		 * I hope I score at least $points points on this assignment.
		 * */
		
		String Message1 = "I hope";
		String Message5 = "I score at least";
		String Message3 = "points on this assignment";
		int point1 = 50;
		System.out.println(Message1 + "," + " " + Message5 + " " + point1 + " " + Message3 + "!" + "\n");
		System.out.println("I hope, I score at least" + " " + point1 + " " + "points on this assignmet.");
		 /* 7) Declare a String variable with the identifier message2 and assign it the
		 * value as follows:
		
		 */

		// Previously declared variables. Do Not Remove or Modify
		String firstName = "Raul";
		String lastName = "Julia";
		int numberOfFilms = 32;

		// Your code goes here
		String message2;
		String FirstName1 = "John";
		String LastName1 = "Duglos";
		int numberOfFilm1 = 58;
		
		System.out.println(FirstName1 + " " + LastName1 + " " + "was an actor, who starred in " + numberOfFilm1 + " " + "movies.");
		
		// Print the $message1 and $message2 and run the code*/
		
		String Message4 = "I hope, I score at least";
		
		String Message = "points on this assignment.";
		int point = 50;
		System.out.println(Message4 + " " + point + " " + Message + " " + FirstName1 + " " 
		+ LastName1 + " " + "was an actor, who starred in " + numberOfFilm1 + " " + "movies.");
		
		
		
	}

}
