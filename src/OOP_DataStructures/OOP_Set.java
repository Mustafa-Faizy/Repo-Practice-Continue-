package OOP_DataStructures;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class OOP_Set {
	
	public static void main(String[] args) {
		
		Set <String> testHashSet = new HashSet <String> ();
	
		testHashSet.add("Test");
		testHashSet.add("Is");
		testHashSet.add("What");
		testHashSet.add("I do!");
		testHashSet.add("Test");
	System.out.println(testHashSet.add("Test1"));//don't have a get method, can iterate do this
	//you use this data only if you want check duplicate
	
	System.out.println(testHashSet);
	
	for (String st : testHashSet) {
		System.out.println(st);
	}
	
	
	HashSet <String> set = new HashSet <String> ();
	//Here data is not added as in indexing approach
	//we got hashCodes for elements which are being added
	set.add("Joggy");
	set.add("John");
	set.add("Joggy");
	set.add("Joy");
	set.add("Jogy");
	set.add("John");
	set.add("Joi");
	
	System.out.println("set is " + set);
	//Data is Unique, no Redundancy
	//Data is unordered in output due to hashing
	
	//iterator of hashing
	
	/*Iterator <String> itr = set.iterator();
	
	while (itr.hasNext ()) {
		String str = itr.next();
		System.out.println(str);
	}
	*/
	set.remove("Joy");
	System.out.println("set after removing Joy is " + set);
	
	if (set.contains("Joggy"))
	System.out.println("Joggy is in the set");
	System.out.println("set size is: " + set.size());
	
	
	}

}
