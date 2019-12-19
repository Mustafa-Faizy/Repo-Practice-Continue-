package OOP;

import java.util.ArrayList;

public class School_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     //I want to create  2 classes
		//Class it's class what we created
		//constructor method, how can I create on an object of this Class, I type the name of Class,which is Class, 
		//then I gave it name = new Class;
		//we are calling the constructor (new)
            Class softwareTestingAutomation = new Class();
	        Class manualTesting = new Class();
	        
	        Student st1 = new Student("Ahmad", "Jan", "Male", true, 27);
	        Student st2 = new Student("Aehh", "Ro", "Male", false, 25);
	        Student st3 = new Student("Permad", "Rued", "Male", false, 26);
	        Student st4 = new Student("Mkead", "Luken", "Male", true, 28);
	        
	        
	        //I can add all of those Students in one class
	        softwareTestingAutomation.addStudent(st1);
	        softwareTestingAutomation.addStudent(st2);
	        softwareTestingAutomation.addStudent(st3);
	        softwareTestingAutomation.addStudent(st4);
	        
	        
	        
	        //arraylist of students (it's gonna get code bcz it doesn't know what I want to print which Student)
	        /*System.out.println(softwareTestingAutomation.getListOfStudents().get(0).getFirstName());
	        
	     
	        System.out.println(softwareTestingAutomation.getListOfStudents().get(0).getLastName());
	       
	        System.out.println(softwareTestingAutomation.getListOfStudents().get(0).getGender());
	        
	        
	        System.out.println(softwareTestingAutomation.getListOfStudents().get(0).getAge());
	        */
	        
	        System.out.println("**********************");
	        
	        //I want each Student add each class
	        //print all of the data of Students
	        
	        //System.out.println(st1.getStudentInfo());//it print the code, we need add the method
	        
	        
	        
	        //we need create new Arraylist in order to put in the pranthesis as subject
	        ArrayList<String> chanSubjects = new ArrayList <String>();//I used one a String to add one subject
	        chanSubjects.add("Karate");
	        chanSubjects.add("Kong Fu");// this teacher has two subjects
	       //this constructer initialize Arraylist and add subjects in arraylist
	        
	        //Class teacher takes all of this variables and created arraylist of a String for chanSubjects
	        //when I created Arraylist, this list chansubjects =>look at another class where we have ArrayList <String> subjects 
	        Teacher t1 = new Teacher ("Jack", "Chan", "Male", 67, chanSubjects);// and it has to be new ArrayList <String>();
	        //we wonna add acting to this list
	        t1.addSubject("Acting");
	        //when I run it it see that Acting subject run it. 
	        //Acting subject added to this list chanSubjects for this teacher
	        
	        ArrayList <String> sub = new ArrayList <String> ();//i'm passing one Arraylist of String
	        sub.add("Sealing things");//I have to add sub in my Arraylist
	        sub.add("Spyling on people");
	        sub.add("Driving ");
	        sub.add("Poker");
	        Teacher t2 = new Teacher("James", "Bond", "Male", 60, sub);//for the subjects I have to put in Arraylist
	         
	       
	       System.out.println(t2.getTeacherInfo());
	        
	        softwareTestingAutomation.getListOfStudents();
	        ArrayList <Student> stList = softwareTestingAutomation.getListOfStudents();
	       
	        for (Student st : softwareTestingAutomation.getListOfStudents()) {
	        	System.out.println(st.getStudentInfo());
	        	//which method give us Student info getterInfo
	        }
	       
	}
	
	
	}


