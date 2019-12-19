package OOP_DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OOP_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String,String> testMap = new HashMap <String , String>();
		
		//we don't have the add method
		//put like add
		testMap.put("City", "Alexandria");
		testMap.put("City", "Alexandria2222");
		testMap.put("City2", "USA");//you can change the value but don't change key
		
		System.out.println(testMap);
		
Map <Integer,String> testMap2 = new HashMap <Integer, String>();
		

		testMap2.put(1, "Alexandria");
		testMap2.put(2, "Alexandria2222");
		testMap2.put(3, "USA");
		
		System.out.println(testMap2);
		
		System.out.println(testMap.get(2));
		
		//ArrayList <String> firstNames = new ArrayList <String>();
		Map <String, ArrayList <String>> studentInfo  = new HashMap <String, ArrayList<String>>();
	
		studentInfo.put("firstNames", new ArrayList <String>());
		studentInfo.put("lastNames", new ArrayList <String>());
		studentInfo.put("student id", new ArrayList <String>());
	
	studentInfo.get("firstNames").add("Jahn");
	studentInfo.get("firstNames").add("Jahn1");
	studentInfo.get("firstNames").add("Jahn2");
	
	
	
	System.out.println(studentInfo);
	}

}
