
public class TerminationCatchBlock {

	public static void main(String[] args) {
		try {
			System.out.println("hi");
			System.out.println("hii");
			System.out.println("hai");
		}catch(Exception e) {
			System.out.println(10/0);
		}finally {
			System.out.println(100/0);
		}
		System.out.println("h");
	}

}
