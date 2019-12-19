package OOP_DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class OOP_Lists {
	
	//how to copy an Array
	
	


public static void main(String[] args) {
	
	
	String [] data = {"1","2","3","4"};
	String [] newData = {"","","",""};

	for (int i = 0; i<data.length; i++) {
		
		newData [i] = data [i];
	}
	
	//creating link list
	
	LinkedList <String> firstLinkedListCreated = new LinkedList <String> ();

	firstLinkedListCreated.add("First Element");
	firstLinkedListCreated.add("Second Element");
	
	firstLinkedListCreated.get(0);//index
	
	for (String s : firstLinkedListCreated) {
		System.out.println(s);
	}
	
ArrayList <String> secondList = new ArrayList <String> ();

secondList.addAll(firstLinkedListCreated);

for (String s : secondList) {
	System.out.println(s);
}



}




}
