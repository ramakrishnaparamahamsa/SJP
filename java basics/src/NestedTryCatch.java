
public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("outer try block");
			try {
				System.out.println("inner try block");
				System.out.println(10/0);
			}catch(ArithmeticException ae) {
				System.out.println("inner catch block");
			}
			System.out.println("outside of inner try-catch");
		}catch(Exception e) {
			System.out.println("oustside catch block");
		}finally {
			System.out.println("inside finally block");
		}
		// TODO Auto-generated method stub

	}

}
