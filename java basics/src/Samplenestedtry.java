
public class Samplenestedtry {

	public static void main(String[] args) {
	try {
		System.out.println("1st");
		System.out.println("2nd");
		System.out.println("3rd");
		try {
			System.out.println("4th");
			System.out.println("5th");
			System.out.println("6th");
		    }catch(Exception e) {
		    	System.out.println("7th");
			}finally {
				System.out.println("8th");
			}
		System.out.println("9th");
	}catch(Exception ae) {
		System.out.println(10/0);
	}finally {
		System.out.println("12th");
	}
		// TODO Auto-generated method stub

	}

}
