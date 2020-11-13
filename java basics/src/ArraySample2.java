
public class ArraySample2 {

	public static void main(String[] args) {
		int [] myArray = new int [10];
		
		PrintArray(myArray);
	} 
	  public static void PrintArray(int[] Array) {
		  for(int i =0; i<Array.length; i++) {
			System.out.println("Element " +  i +  ", value is "  +  Array[i]);
		}

	}

}
