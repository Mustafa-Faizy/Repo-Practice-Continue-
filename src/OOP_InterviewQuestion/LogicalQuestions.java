package OOP_InterviewQuestion;

import java.util.ArrayList;

public class LogicalQuestions {

	/*
	Write a method which prints out the numbers from start to end, BUT
	for numbers which are a multiple of 3, print FIN instead of the number, AND
	for numbers which are a multiple of 5, print RA instead of the number. FINALLY,
	for numbers which are a multiple of both 3 AND 5, print FINRA instead of the number
	Example Output:
	1
	2
	FIN
	4
	RA
	FIN
	7
	8
	FIN
	RA
	11
	FIN
	13
	14
	FINRA
	16
	…
	*/
	
	//method definition
	//method input must be start and end of the rang of the numbers
	//the method does not have a return, it's just printing
	//I know I have to loop trhough the start to end
	
	//conditions inside my loop
	//if the number is multiple of 3
	//if the number is multiple of 5
	public void testMethod(int start, int end) {
		for (int i = start; i<=end; i++) {
			
			if (i%3 == 0) {
				System.out.println("FIN");
			} else if (i%5 == 0) {
				System.out.println("RA");
			}else if (i%3 ==0 && i%5 == 0) {
				System.out.println("FINRA");
			}
			else {
			
			System.out.println(i);
		}
		}
	}

	public static void main(String[] args) {
	

 //I should create object
		LogicalQuestions obj = new LogicalQuestions ();
		
		obj.testMethod(1, 20);
	System.out.println();
	
	}
 
 
 




}
