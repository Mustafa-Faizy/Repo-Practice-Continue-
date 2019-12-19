
public class Java_Basics_exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int data [] = {1,2,53,99,60,23,7}; 

        System.out.println("********For loop******");
        
        for (int i = 0; i<data.length; i++) {
        	System.out.print(data [i]+ " ");
        }
        
        System.out.print("\n"+"******ForEach loop******\n");
        
        for (int y : data) {
        System.out.print(y + " ") ;}
        
        System.out.println("\n********While loop*****\n");
        
        int z = 0; 
        while (z<data.length) {
        	System.out.print(data [z] + " ");
        z++;
        }
        System.out.println("\n******do while loop****");
        
        int k = 0;
        do 
        {
        	System.out.print(data [k] + " ");
        
        	k++;
        	}
        	while (k<data.length) ;
        
        	
       
    }
}

