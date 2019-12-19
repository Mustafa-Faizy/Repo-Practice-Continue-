package OOP_ExeceptionHandling;

public class ExcHwithMethods {

public static int divide (int a, int b) throws ArithmeticException {
	return a/b;
}
	
	
public static void main(String[] args) {

	//calling method
	
	//int x = divide (6, 0);//when we put 0, program will be crash
	//System.out.println(x);//we will get arithmeticExceptions

	//when the problem happends, we should use try and catch

	int x = 0;
	try {
	  x = divide (6,0);
 }catch (ArithmeticException e){
	 System.out.println("you cannot divide by zero");
 }
System.out.println(x);

//i'm gonna create 2 variables
/*int z = 5;
int y = 0;
System.out.println(x/y);
System.out.println("The end");
*/
//program is running and the crash preferred
int [] array = {2,5,7,12,23,15};
for (int i = 0; i<=array.length; i++) {//IndexoutOfboundexception 
	System.out.println(array [i]);//last index is 5, we want to run 6 
}
//if we want to add smth else after crash it shouldn't be show, we should use try catch

}
}
