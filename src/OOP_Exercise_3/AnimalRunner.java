package OOP_Exercise_3;

import java.util.ArrayList;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <Animal> myanimal = new ArrayList <Animal> ();//polymorphism. Dogs and cats stored in Animal
		ArrayList <Dog> mydogs = new ArrayList <Dog> ();
		System.out.println("My Dogs");
		Dog d1 = new Dog ("white", "Puppy", 2, true);
		Dog d2 = new Dog ("Black", "Liky", 3, false);
		Dog d3 = new Dog ("Brown", "Lol", 4, true);
		myanimal.add(d1);
		myanimal.add(d2);
		myanimal.add(d3);
		mydogs.add(d1);
		mydogs.add(d2);
		mydogs.add(new Dog("blue", "loly", 5, true));//we call construction methed from dog child class
		//other way writing the code
		Dog d4 = mydogs.get(2);//it means it's dog=loly
		
		//static
		System.out.println(d1.getCount());//how get count
		//bcz at the last time I assigned the value with 4 number is a static
		
		System.out.println(mydogs.get(2).getName());
		
		System.out.println("My cats");
		
		Cat c1 = new Cat (2, "KItty", 3, true);
		Cat c2 = new Cat (3, "Lucky", 4, false);
		Cat c3 = new Cat (4, "BIbi", 5, true);
		
		myanimal.add(c1);
		myanimal.add(c2);
		myanimal.add(c3);
		//if i want to create new object of my dog I can use this method
		myanimal.add(new Animal("gug", 5, true));//we call construction method in Animal class
		System.out.println("My birds");
		
		Bird b1 = new Bird ("Home bird", "Max", 1, true);
		Bird b2 = new Bird ("Fly bird", "Eagle", 12, false);
		Bird b3 = new Bird ("Nursing bird", "Mmi", 5, false);
		myanimal.add(b1);
		myanimal.add(b2);
		myanimal.add(b3);
		
	for (Animal myani: myanimal) {
		System.out.println(myani.getName() +" "+ myani.getAge()+ " ");
	}
	Animal obj = new Cat(2, "Koty", 3, false);//it works bcz cat is child class of Animal
	
	System.out.println(obj);//take a code

	//toString
	
	System.out.println(obj.toString());}
	//we create an ArrayList that stored all datatypes that we have (int,double, String)
	/*Arraylist <Object> allDataTypes = new ArrayList <Object> ();
	//all of the dataTypes inheritaned from Object
//can we store multiple dataTypes, yes we can
	allDataTypes.add("test");
	allDataTypes.add(12); //refering like wrapperclass Integer
	allDataTypes.add(true);//Boolean wrapper
	alldataTypes.add(12.12);
	alldataTypes.add(new Dog ("Dogy", 5,true));
	
	for (Object o : allDataTypes) {
		System.out.println(o);*/
	//}
	
}
