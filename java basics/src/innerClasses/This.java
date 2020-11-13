package innerClasses;

public class This {
	int x =10;
	public class Inner{
		int x =100;
		public void m1() {
			int x = 1000;
			System.out.println(x);// To get local variable of m1
			System.out.println(this.x);// to get  inner class instance variable .
			System.out.println(This.this.x);// to get outer(This) class instance variable
		}
	}

	public static void main(String[] args) {
		This t = new This();
		This.Inner i = t.new Inner();
		i.m1();
		

	}

}
