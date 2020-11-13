package innerClasses;

public class Outer {
	public class Inner{
		public void m1() {
			System.out.println("Inner class output ");
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		System.out.println(o.getClass().getName());

	}

}
