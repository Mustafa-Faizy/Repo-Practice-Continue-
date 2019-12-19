package OOP_Interview_ques_Naveen;

public class remove_Junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how will remove of special characters
		//you have to use regular expression for that
		//Regular expression : [a-zA-Z0-9]
		String str = ")*^%% String replace 093959";
				str = str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(str);
	
	String str1 = ")(&^%%% Selenium ^&*^% Java (&%% Agile";
	str1 = str1.replaceAll("[^a-zA-Z0-9]", " ");
	
	System.out.println(str1);
	}
	
	

}
