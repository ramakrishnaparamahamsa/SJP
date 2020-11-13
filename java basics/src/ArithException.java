
public class ArithException {

	public static void main(String[] args) {
		System.out.println("statement 1");
		try {
		System.out.println(10/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("statement 3");
		// TODO Auto-generated method stub

	}

}
