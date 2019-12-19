package OOP;

public class MandM {
	// in class we have different variables
	
	String color = ""; //this is one of the variables that this class is stores
	// we also have methods in each class
	//one of the method is "constructor method". 
	//It helps create objects of this class 
	
	//the basic structure constructor method
	//(Access Modifier Name of class (argument) {code block})
	//(arguments- what does constructor should take 
	//(exm.should ask the color, what color MandM do they want)
	public MandM (String colorOfTheObject) {
		color = colorOfTheObject;
		
			}
	//methods (getters method because they are getting smth for you)
	//Access Modifier Return-Datatype Method-Name(argument) {code block}
	//getters have always "return" DataType
	//getters can have arguments or can have not arguments
	public String getColor () {  
	//when we call this method, it's gonna return the value of above String
		return color;}
		
		//setters method-it will change the value
		//Access Modifier Return-Datatype(void -it means nothing) Method-Name(argument) {code block}
		public void setColor (String newColor) {
			color = newColor;//it's not gonna print anything
		}

		
	}
	


