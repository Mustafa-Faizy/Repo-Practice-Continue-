package OOP;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// I like to create all of these MandM's;
		//class stores one variable, which is the color
	
		//create objects of a String color
		MandM obj1 = new MandM ("Green") ;//this data doesn't change the blueprint
		
		MandM obj2 = new MandM ("Yellow") ;
		MandM obj3 = new MandM ("Yellow") ;
		obj1.getClass();
		System.out.println(obj3.getColor());
		obj3.setColor("Brown");
		System.out.println(obj3.getColor());
		MandM obj4 = new MandM ("Yellow") ;
		
		MandM obj5 = new MandM ("Blue") ;
		MandM obj6 = new MandM ("Blue") ;
		MandM obj7 = new MandM ("colorOftheObject");
	// we create 6 objects(they have different data) in the same one class
	System.out.println(obj1.toString());//datatype is the class MandM 
	// we get the code
	//it's gonna return that value that we mentioned in MandM class-it's String 
		
	// we have to create other method in class MandM
		System.out.println(obj1.getColor());
		System.out.println(obj5.getColor());
		
	}

}
