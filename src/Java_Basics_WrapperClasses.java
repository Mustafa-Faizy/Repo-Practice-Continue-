
public class Java_Basics_WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int -datatype
		//Integer -object;
		
		String x = "123";
		String y = "258";
	
		System.out.println(x + y);
		//we need to convert String to int and have to use wrapper class
		System.out.println(Integer.valueOf(x) + Integer.valueOf(y));
		
		//create wrapper class as object for int;
		int i = 10;
		Integer iObj =  new Integer (i);
		//iObj is the wrapperClass of integer and with iObj open the windows with different methods
	//char y = 11;
	//char yObj =new Character (y);
	/*double x = new Double ();
	boolean z = new Boolean ();
	long r=new Long ();
	short n = new Short ();
	byte m = new Byte();
	float w = new Float ();*/
		System.out.println("********************");
		//Conversion String to integer
		String z = "100";
		System.out.println(z+20);
		
		int k = Integer.parseInt(z);
		System.out.println(Integer.parseInt(z) +20);
		System.out.println(k+20);
		
		//String to double
		String str = "12.33";
		double d = Double.parseDouble(str);
		System.out.println(Double.parseDouble(str)+10);
		System.out.println(d+10);
		
		//String to boolean
		String bol = "true";
		boolean b = Boolean.parseBoolean(bol);
		System.out.println(b);
		
		//int to String conversion
		int u = 10;
		String s = String.valueOf(u);
		System.out.println(s+20);
	
		//we can't convert this value
		String g = "100A";//NumberFormatException.forInputString(Unknown Source)
		int t = Integer.parseInt(g);
		System.out.println(t);

	
	
	
	
	
	
	}
	

}
