package OOP;

import java.util.ArrayList;

public class Teacher {
	
	String firstName;
	String lastName;
	String gender;
	int age;
	ArrayList <String> subjects;
	
	public Teacher (String firstName, String lastName, 
			String gender, int age, ArrayList <String> subjects){//I'm passing Arraylist of a String not a String
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age=age;
		this.subjects = subjects;}//this subject is the argument in arraylist
	//p.S add.subjects in arraylist
	public Teacher (String firstName, String lastName, 
			String gender, int age, String subject){//I'm passing a String not Arraylist of a String//this is one a String and add this String to the Arraylist
		this.firstName = firstName;//the user can add more subjects, it can do it by returning add
		this.lastName = lastName;
		this.gender = gender;
		this.age=age;
		subjects = new ArrayList <String> ();//initialize my Arraylist inside teh const.
		subjects.add(subject);//and add it this first subject that they give me
	}//after this const.they are going to have one subject of this class
		//if you want to have more subject the you need use add.sub.
		//p.S. this constructer return chanSubject		
	
	public String getfirstName () {
		return firstName;
	}
	public void setfirstName (String newfirstName) {
		firstName = newfirstName;
	}
	public String getlastName () {
		return lastName;
	}
	public void setlastName (String newlastName) {
		lastName = newlastName;
	}
	public String getgender () {
		return gender;
	}
	public void setgender (String newgender) {
		gender = newgender;
	}
	public int getage () {
		return age;
	}
	public void setage (int newage) {
		age = newage;
	}
	public ArrayList <String> getsubjects () { //return the Arraylist of a String listOf Subjects
		return subjects;
	}
	public void setsubjects (ArrayList<String> newsubjects) { //take ArrayList of a String
		subjects = newsubjects;
	}
	
	//exmp.I'm a teacher. I teach Java and SQL, I want to add subject like Sellenium
	//If I use the Arraylist for adding, it take me all list, we need one String
	// we will create the method should not return anything. 
	// it should take and add the string to the list of subjects
	//and it should print to console a confirmation message "Subject added!"
	
	
	//this is the method of adding Subject in chansubjects of School runner
	public void addSubject (String newsubject) {//when I call this method what this method take?
	
		subjects.add(newsubject);//add new subject
		System.out.println(newsubject + " Subject added"); // print new object
	}
	
	//get method for teacherInfo
		public String getTeacherInfo () {
			
			String info = ("First name" + firstName + "Last name"+ lastName
					+"Gender:" + gender + "Age" + age + "Subject:") ;
			int num =1;
			for (String st : subjects) {
				info+= "\nSubject" + num++ + "=" + st;}
				
						
			return info;
			
	
	}
	
}
