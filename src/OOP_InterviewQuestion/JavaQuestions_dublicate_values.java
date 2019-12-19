package OOP_InterviewQuestion;

public class JavaQuestions_dublicate_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//create an Array of a String
		//how can I find if there is a dublicate value an Array
		String data [] = { "Test", "Data", "IS", "Only", "Test", "DATA"};
	
		
		//using method equals 
		//what I need to do: check the first element to the second one and see if the are the same
		//and then check it to the next one, next one and next one
		//I need to check all of them to the next element and we are see dublicate or no 
	//I have to loop to this Array, I want to go this Array
		int dupCount = 0; //cm v tetrad
		for (int i=0; i<data.length; i++) {//go to for the all of the elements
	//now I need to take first element check and compare to the rest of them, in second iteration I need to take seconqd element and I need to compared rest of them
	// and see if there is any other element of list that is equal to this one "Test" 
	//that would be our first iteration for the loop then go to the next element
		//you don't need a check previous element, bcz we checked it
		//iteration by this loop it's not by one loop, we gonna o nested loop, inner nested loop abd outor
			//when I checked and compare Test it's my inner loop, when I chek "Data" it's second iteration it's my outer loop
		//cm v tetrad
			//for the first object what I need to do I'm goona say data [] put i in the array
			//data [i] and you gonna ask if this is == to inner loop of object(2) data [j] 
		for (int j = i+1; j<data.length; j++) {//cm v tetrad
			//data [i] == data [j]; //j=0; i=0; on the first iteration
			//now I want to compare them what shoul i use:
		if (data [i].equalsIgnoreCase(data[j])) {//if it's true the we have duplicate value i-is first iteration j =second
			System.out.println("There is a dublicate value" + data [i]+ " values are in index  " + i +" "+j); //we want to show duplicate value the add data i or j 
			
			//cm v tetrad // if we want consider upper and lower case, then we can put equalIgnoreCase
		dupCount ++;
		}
		
		
		}
		if (dupCount>0) {
			break;//it's meaning stop looping
		}//is this efficcient? No. Why?
		}
		
	

	
	
	
	
	
	
	}

}
