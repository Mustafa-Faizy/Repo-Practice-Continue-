package OOP;

import java.util.ArrayList;

public class Class {
	//This class can have a list of Students
	//declare an object (saving the name of datatype)
	//we can do : ArraList <Student> listOfStudent = new Arraylist <Student>();
	ArrayList<Student> listOfStudent;//we will initialize in the constructor
	//constructor method
    public Class() {
    	//initialize an object (you are reserving the space in the memorize)
        listOfStudent = new ArrayList<Student>();//(10 if I put)limit the size of arraylist
        //I don't know what Students do I have. I create just list, it's empty
    }
    
    //getters method
    //Access Modifier, return datatype, whats we return (){}
    public ArrayList<Student> getListOfStudents(){
        return listOfStudent;
    }
    
    //adding method (customize method)
                           //ask you what do you want add
    public void addStudent(Student newStudent) {
    	//where I want to add, using Arraylist, newStudent
        listOfStudent.add(newStudent);//take the Student and add to this list
    }
    //in this case setter method it will be replace whole list in a new list
    
}


