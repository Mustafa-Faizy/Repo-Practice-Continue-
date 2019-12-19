
public class ContinueAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i<=10; i++) {
	
			
			if (i ==9) {
				System.out.println("Continue");
				
				break;
			}
			else if (i%3 == 0) {System.out.println("Break");
				continue;
			}else {
				System.out.println(i);
			}
		}
	}

}
