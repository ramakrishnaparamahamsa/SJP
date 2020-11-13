package innerClasses;

public class MethodInner {
	public void m1() {
		class Inner{
			public void sum(int x, int y) {
				System.out.println("the sum is : "+(x+y));
			}
		}
		Inner i = new Inner();
		i.sum(10,20);
		i.sum(100, 200);
		System.out.println(i.getClass().getName());
	}

	public static void main(String[] args) {
		MethodInner mi = new MethodInner();
		mi.m1();
		
		

	}

}
