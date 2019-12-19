package OOP_Non_AccessModifier;

public class None_AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//difference final-NonAM
		//finally- code block use from acception finallieng
		//finalize- method, Java virtual maschine, garbage collector
		
		final int x =10;//it's telling me you can not x=15;
		
		
		final double taxRate = 0.1;//later of code I shouldn/t be change the taxRate
		//if I wonna change the taxRate I should it on the top, where we write the taxRate=0.1
	
	
	Book b1 =new Book("Java", "No one", 546, "someone", "5th");
	Book b2 =new Book("C#", "No one", 546, "someone", "5th");
	Book b3 =new Book("Python", "No one", 546, "someone", "5th");

	Book.numberOfbooksIntheSystem();
	//System.out.println(b2);//bcz count =0; every time i would be create an object it would be  one
	//if we put static count =0; count++ every time what we would be create an object it would be encriese by one
	//bcz static belongs to class (Book) not b1 (object)
	}
}
