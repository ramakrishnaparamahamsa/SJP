package innerClasses;

public class StaticNested {
	static class Nested{
		public void m1() {
			System.out.println("static nested class only");
		}
	}
	
	public static void main(String[]args) {
		Nested n = new Nested();
		n.m1();
	}

}

// if you want to create nested class object outside of outer(StaticNested) class 
// StaticNested.Nested n = new StaticNested.Nested();

// Outer.Nested n = new Outer.Nested();