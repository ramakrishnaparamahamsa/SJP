
public class ArraySample {

	public static void main(String[] args) {
		int [] myArray = new int [10];
		for(int i =0; i<myArray.length; i++) {
			myArray[i]= i*10;
		}
		
		for(int i =0; i<myArray.length; i++) {
			System.out.println("Element " +  i +  ", value is "  +  myArray[i]);
		}

	}

}
