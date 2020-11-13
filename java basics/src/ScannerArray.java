import java.util.Scanner;

public class ScannerArray {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int [] x = getIntegers(3);
		for(int i=0;i<x.length;i++) {
			System.out.println("element "+i + ", typed value is "+x[i]);
			
		}System.out.println("average of " +   " integer values is " +getAverage(x));

	}
	public static int[] getIntegers(int number) {
		System.out.println("Enter "+number + " integer values.\r");
		int [] values = new int[number];
		
		for(int i = 0; i<values.length;i++) {
			values[i] = sc.nextInt();
			
		}
		
		return values;
		
	}
	
	public static double getAverage(int [] y) {
		int sum =0;
		for(int i=0;i<y.length;i++) {
			sum += y[i];
		}
		
		return (double)sum/(double)y.length;
	}

}
