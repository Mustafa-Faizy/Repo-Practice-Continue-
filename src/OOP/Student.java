package OOP;

public class Student {
	
	//variables; we create info about Student (it's our blueprint)
	//the data that I have a store in this class 
	//here we only declare variables
    String firstName;
    String lastName; 
    String gender; 
    boolean enrolled;
    int age;
    
    //create default constructor -it means the const.without any arguments
    //it's method overloading - having same multiple methods with different arguments
    public Student () {//don't give me data only initialize//for customize data
    	firstName = "";
    	lastName = "";
    	gender = "";
    	enrolled = false;
    	age = 0;
    }
    
    //in constructor method we initialize variables (it needs to create an objects)
    //Access Modifier Name of class (arguments) {block of code};
    public Student(String f_name, String l_name, String g, boolean e, int a) {
        //this f_name is different than the firstName on above
    	//someone created an object of this class and it will be calling this method
//it'gonna asked what has this values, when call the firstName I need to give the f_name
         //call
    	firstName = f_name;//give
        lastName = l_name;
        gender = g;
        enrolled = e;
        age = a;
        
    }
    //create second construction 
    //on the object will call only firstName and lastName
    public Student (String f_name, String l_name) {//this is input
    	firstName = f_name;
    	lastName = l_name;
    	//gender = ""; //it will be crash if we will create empty variables
    	//I want to create the object but don't need now all of above variables
    	//enrolled = false;//I want some variables add later, then we can create multiple const.meth.
    	//age = 0;
    	
    }
    //when I create this constructor method we can create all other methods
    //getter for first name
    //Access Modifier return Datatype () {}
    public String getFirstName() {
        return firstName;
    }
    
    //setter method for first name
    //Access MOdifier void (arguments) {}
    public void setFirstName(String newName) {
        firstName = newName;//This first Name that I have, when I return the new Name it's gonna change it
    }
    //each method performed some action
    public String getLastName() {
    	return lastName;
    }
    public void setLastName (String newlastname) {
    	lastName = newlastname;
    }
    public String getGender () {
    	return gender;
    }
     public void setgender (String newGender) {
    	 gender = newGender;
     }
    public boolean getEnrolled () {
    	return enrolled;
    	
    }
    public void setBoolean (boolean  newEnrolled) {
    	enrolled = newEnrolled;
    }
    
    public int getAge () {
    	return age;
    }
    public void setAge (int newAge) {
    	age = newAge;
    }
    
    public String getStudentInfo () {
    	String info = "";
    	//we want to use "If" for boolean
    	String status = "";
    	
    	if (enrolled) {
    		status = "Student enrolled";
    	}
    	else {
    		status= "Student Not enrolled";
    	};
    	
    	info = "F_Name " + firstName + " " +"L_Name "+ lastName + " " +
    	"Gender "+ gender +" " +"Enrollment Status "+ status + " "+ "Age "+ age;
    	
    	
    	return info;
    }
    
    
    
}
