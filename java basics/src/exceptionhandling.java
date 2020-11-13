
public class exceptionhandling {

	public static void main(String[] args) {
		System.out.println("topic is exception handling");
		try {
			int a =10;
			int b =0;
			int c= a/b;
			
			
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("excepton is handled");
		// TODO Auto-generated method stub

	}

}
